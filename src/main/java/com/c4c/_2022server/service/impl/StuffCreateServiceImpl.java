package com.c4c._2022server.service.impl;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.form.StuffCreateReq;
import com.c4c._2022server.mapper.StuffMapper;
import com.c4c._2022server.service.StuffCreateService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class StuffCreateServiceImpl implements StuffCreateService {
    @Autowired
    StuffMapper stuffMapper;
    @Autowired
    EntityUtils entityUtils;
    @Autowired
    MessageSource messageSource;

    @Override
    public void register(int storeId, int stuffId, StuffCreateReq reqForm) throws Exception {
        // メールアドレスが登録済みかチェック
        Stuff checkStuff = stuffMapper.select0001(reqForm.getEmail());
        if (checkStuff != null) {
            throw new DuplicationException(messageSource.getMessage("error.email.registered", new String[]{}, Locale.getDefault()));
        }
    	Stuff stuff = new Stuff();
    	stuff.setStoreId(storeId);
    	stuff.setLastName(reqForm.getLastName());
    	stuff.setFirstName(reqForm.getFirstName());
    	stuff.setLastNameKana(reqForm.getLastNameKana());
    	stuff.setFirstNameKana(reqForm.getFirstNameKana());
        // 生年月日がnullまたは空文字でない場合
        if (!(Objects.equals(reqForm.getBirthday(), null) || Objects.equals(reqForm.getBirthday(), ""))) {
        	stuff.setBirthday(LocalDate.parse(reqForm.getBirthday()));
        }
        stuff.setAge(reqForm.getAge());
        stuff.setGender(reqForm.getGender());
        stuff.setRankId(reqForm.getRankId());
        stuff.setPostalCode(reqForm.getPostalCode());
        stuff.setPrefectureId(reqForm.getPrefectureId());
        stuff.setAddress1(reqForm.getAddress1());
        stuff.setAddress2(reqForm.getAddress2());
        stuff.setAddress3(reqForm.getAddress3());
        stuff.setPhoneNumber(reqForm.getPhoneNumber());
        stuff.setEmail(reqForm.getEmail());
        // パスワードを暗号化(エンコード)
        BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        String encodeedPassword = bcpe.encode(reqForm.getPassword());
        stuff.setPassword(encodeedPassword);

        // INSERT時の共通設定
        entityUtils.setColumns4Insert(stuff, stuffId);
        // INSERTを実行し、データを登録する
        stuffMapper.insert(stuff);
    }
    
}
