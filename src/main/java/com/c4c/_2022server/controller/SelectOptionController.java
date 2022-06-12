package com.c4c._2022server.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.constants.ReserveState;
import com.c4c._2022server.entity.MenuHeader0001;
import com.c4c._2022server.entity.RankByStore0001;
import com.c4c._2022server.form.SelectOption;
import com.c4c._2022server.mapper.MenuHeaderMapper;
import com.c4c._2022server.mapper.RankByStoreMapper;

@RestController
@RequestMapping("/selectOption")
public class SelectOptionController {
    @Autowired
    RankByStoreMapper rankByStoreMapper;
    @Autowired
    MenuHeaderMapper menuHeaderMapper;

    @GetMapping("/ranks")
    public ResponseEntity<List<SelectOption>> getRanksOptions() {
        // ランク取得
        List<RankByStore0001> rankList = rankByStoreMapper.select0001();
        List<SelectOption> selectOptionList = new ArrayList<>();

        // 初期値の選択肢を追加
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("0");
        selectOption.setName("指定なし");
        selectOptionList.add(selectOption);

        int count = 1;
        // 検索結果全件に対しての処理
        for (RankByStore0001 rank : rankList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            String code = String.valueOf(count);
            tempSelectOption.setCode(code);
            tempSelectOption.setName(rank.getRank());
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
            count++;
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/menus")
    public ResponseEntity<List<SelectOption>> getMenusOptions() {
        // メニュー取得
        List<MenuHeader0001> menuList = menuHeaderMapper.select0001();
        List<SelectOption> selectOptionList = new ArrayList<>();
        
        // 初期値の選択肢を追加
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("0");
        selectOption.setName("指定なし");
        selectOptionList.add(selectOption);
        
        int count = 1;
        // 検索結果全件に対しての処理
        for (MenuHeader0001 menu : menuList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            String code = String.valueOf(count);
            tempSelectOption.setCode(code);
            tempSelectOption.setName(menu.getMenu());
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
            count++;
        }
        return ResponseEntity.ok(selectOptionList);
    }
    
    @GetMapping("/reserveStates")
    public ResponseEntity<List<SelectOption>> getReserveStatesOptions() {
        // 予約状態取得
        List<String> reserveStateList = ReserveState.LIST;
        List<SelectOption> selectOptionList = new ArrayList<>();
        
        // 初期値の選択肢を追加
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("0");
        selectOption.setName("指定なし");
        selectOptionList.add(selectOption);
        
        int count = 1;
        // 検索結果全件に対しての処理
        for (String reserveState : reserveStateList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            String code = String.valueOf(count);
            tempSelectOption.setCode(code);
            tempSelectOption.setName(reserveState);
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
            count++;
        }
        return ResponseEntity.ok(selectOptionList);
    }
}
