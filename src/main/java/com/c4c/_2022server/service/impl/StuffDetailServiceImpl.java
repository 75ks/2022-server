package com.c4c._2022server.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.entity.StuffExample;
import com.c4c._2022server.form.StuffDetailRegisterReq;
import com.c4c._2022server.form.StuffDetailRes;
import com.c4c._2022server.mapper.StuffMapper;
import com.c4c._2022server.service.StuffDetailService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class StuffDetailServiceImpl implements StuffDetailService {
    @Autowired
    StuffMapper stuffMapper;
    @Autowired
    EntityUtils entityUtils;
    
    @Override
    public StuffDetailRes initialize(int storeId, int stuffId) {
    	// スタッフID・店舗IDに紐づく1件を取得する
    	StuffExample stuffExample = new StuffExample();
    	stuffExample.createCriteria().andStoreIdEqualTo(storeId).andStuffIdEqualTo(stuffId);
    	List<Stuff> stuffList = stuffMapper.selectByExample(stuffExample);
//    	List<StuffList0002> stuffList = stuffMapper.select0003(storeId, stuffId);
    	// Formにデータを詰める（レスポンスフォームに移送する）
    	StuffDetailRes resForm = new StuffDetailRes();
    	BeanUtils.copyProperties(stuffList.get(0), resForm);
    	return resForm;
    }
    
    /**
     * スタッフ情報更新
     * @param stuffId
     * @param storeId
     * @param reqForm
     */
    @Override
    public void register(int stuffId, int storeId, StuffDetailRegisterReq reqForm) {
        // Formにデータを詰める
        Stuff stuff = new Stuff();
        BeanUtils.copyProperties(reqForm, stuff);
        // UPDATE時の共通設定
        entityUtils.setColumns4Update(stuff, stuffId);
        // UPDATEを実行し、データを登録する
        stuffMapper.updateByPrimaryKeySelective(stuff);
    }
}



//    @Override
//    public StuffDetailRes initialize(int storeId, int stuffId) {
//    	// スタッフID・店舗IDに紐づく1件を取得する
//    	StuffList0002 stuffList0002 = stuffMapper.select0003(storeId, stuffId);
//        // Formにデータを詰める
//    	StuffDetailRes resForm = new StuffDetailRes();
//    	resForm.setStuffId(stuffList0002.getStuffId());
//    	resForm.setStoreId(stuffList0002.getStoreId());
//    	resForm.setLastName(stuffList0002.getLastName());
//    	resForm.setFirstName(stuffList0002.getFirstName());
//    	resForm.setLastNameKana(stuffList0002.getLastNameKana());
//    	resForm.setFirstNameKana(stuffList0002.getFirstNameKana());
//    	resForm.setRank(stuffList0002.getRank());
//    	resForm.setBirthday(stuffList0002.getBirthday());
//    	resForm.setAge(stuffList0002.getAge());
//    	resForm.setGender(stuffList0002.getGender());
//    	resForm.setPostalCode(stuffList0002.getPostalCode());
//    	resForm.setPrefectureId(stuffList0002.getPrefectureId());
//    	resForm.setAddress1(stuffList0002.getAddress1());
//    	resForm.setAddress2(stuffList0002.getAddress2());
//    	resForm.setAddress3(stuffList0002.getAddress3());
//    	resForm.setPhoneNumber(stuffList0002.getPhoneNumber());
//    	resForm.setEmail(stuffList0002.getEmail());
//    	resForm.setPassword(stuffList0002.getPassword());
//        return resForm;
//    }
//    
//}
