package com.c4c._2022server.service.impl;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.entity.StuffExample;
import com.c4c._2022server.exception.DuplicationException;
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
    @Autowired
    MessageSource messageSource;

    /**
     * 初期表示
     * @param storeId 店舗ID
     * @param stuffId 顧客ID
     * @return スタッフ詳細情報
     */
    @Override
    public StuffDetailRes initialize(int storeId, int stuffId) {
        // スタッフID・店舗IDに紐づく1件を取得する
        StuffExample stuffExample = new StuffExample();
        stuffExample.createCriteria().andStoreIdEqualTo(storeId).andStuffIdEqualTo(stuffId);
        List<Stuff> stuffList = stuffMapper.selectByExample(stuffExample);
        // Formにデータを詰める（レスポンスフォームに移送する）
        StuffDetailRes resForm = new StuffDetailRes();
        BeanUtils.copyProperties(stuffList.get(0), resForm);

        return resForm;
    }

    /**
     * スタッフ情報更新
     * @param stuffId スタッフID
     * @param storeId 店舗ID
     * @param reqForm 画面からの入力値
     * @throws DuplicationException
     */
    @Override
    public void register(int stuffId, int storeId, StuffDetailRegisterReq reqForm) throws DuplicationException {
        // 更新対象のスタッフ情報を取得
        StuffExample stuffExample = new StuffExample();
        stuffExample.createCriteria()
                .andStuffIdEqualTo(reqForm.getStuffId()); // スタッフID
        Stuff stuff = stuffMapper.selectByExample(stuffExample) // 検索を行う
                .stream() // streamに変換する
                .findFirst() // 先頭の1件を取得する
                .orElse(null); // 先頭の1件が取得できない場合は、nullを返す

        // メールアドレスが登録済み かつ 別スタッフのメールアドレスかチェック
        Stuff checkStuff = stuffMapper.select0001(reqForm.getEmail());
        if (checkStuff != null && !(checkStuff.getEmail().equals(stuff.getEmail()))) {
            throw new DuplicationException(messageSource.getMessage("error.email.registered", new String[]{}, Locale.getDefault()));
        }
        // Formにデータを詰める
        BeanUtils.copyProperties(reqForm, stuff);
        // UPDATE時の共通設定
        entityUtils.setColumns4Update(stuff, stuffId);
        // UPDATEを実行し、データを登録する
        stuffMapper.updateByPrimaryKeySelective(stuff);
    }
}
