package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.StuffList0001;
import com.c4c._2022server.form.StuffListFormReq;
import com.c4c._2022server.form.StuffListFormRes;
import com.c4c._2022server.mapper.StuffMapper;
import com.c4c._2022server.service.StuffListService;

@Service
public class StuffListServiceImpl implements StuffListService {
    @Autowired
    StuffMapper stuffMapper;

    /**
     * スタッフ一覧取得
     * @return stuffFormList
     */
    @Override
    public List<StuffListFormRes> index(int storeId, StuffListFormReq reqForm) {
        // SELECT文を実行し、データを取得する
    	List<StuffList0001> stuffList = stuffMapper.select0002(storeId, reqForm);
        // Formにデータを詰める
        List<StuffListFormRes> stuffFormList = new ArrayList<>();
        for (StuffList0001 stuffList0001 : stuffList) {
        	StuffListFormRes stuffForm = new StuffListFormRes();
        	stuffForm.setStuffId(stuffList0001.getStuffId());
        	stuffForm.setStoreId(stuffList0001.getStoreId());
        	stuffForm.setLastName(stuffList0001.getLastName());
        	stuffForm.setFirstName(stuffList0001.getFirstName());
        	stuffForm.setLastNameKana(stuffList0001.getLastNameKana());
        	stuffForm.setFirstNameKana(stuffList0001.getFirstNameKana());
        	stuffForm.setRank(stuffList0001.getRank());
        	stuffForm.setBirthday(stuffList0001.getBirthday());
        	stuffForm.setAge(stuffList0001.getAge());
        	stuffForm.setGender(stuffList0001.getGender());
        	stuffFormList.add(stuffForm);
        }
        return stuffFormList;
    }
}
