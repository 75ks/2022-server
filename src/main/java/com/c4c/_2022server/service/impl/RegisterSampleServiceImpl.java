package com.c4c._2022server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.form.RegisterSampleReq;
import com.c4c._2022server.mapper.StuffMapper;
import com.c4c._2022server.service.RegisterSampleService;

@Service
public class RegisterSampleServiceImpl implements RegisterSampleService {
    @Autowired
    StuffMapper stuffMapper;

    @Override
    public void register(RegisterSampleReq reqForm) {
        Stuff stuff = new Stuff();
        stuff.setStoreId(Integer.parseInt(reqForm.getStoreId()));
        stuff.setLastName(reqForm.getLastName());
        stuff.setFirstName(reqForm.getFirstName());
        stuff.setLastNameKana(reqForm.getLastNameKana());
        stuff.setFirstNameKana(reqForm.getFirstNameKana());
        stuff.setRank(reqForm.getRank());
        stuff.setGender(Integer.parseInt(reqForm.getGender()));
        stuff.setEmail(reqForm.getEmail());
        // パスワードを暗号化(エンコード)
        BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        String encodeedPassword = bcpe.encode(reqForm.getPassword());
        stuff.setPassword(encodeedPassword);
        // INSERTを実行し、データを登録する
        stuffMapper.insert(stuff);
    }

}
