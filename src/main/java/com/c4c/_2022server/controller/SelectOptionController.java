package com.c4c._2022server.controller;

import java.util.ArrayList;
import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.entity.MenuHeader;
import com.c4c._2022server.entity.MenuHeaderExample;
import com.c4c._2022server.entity.RankByStore;
import com.c4c._2022server.entity.RankByStoreExample;
import com.c4c._2022server.enums.GenderEnum;
import com.c4c._2022server.enums.PrefectureIdEnum;
import com.c4c._2022server.enums.ReserveStateEnum;
import com.c4c._2022server.form.SelectOption;
import com.c4c._2022server.mapper.MenuHeaderMapper;
import com.c4c._2022server.mapper.RankByStoreMapper;
import com.c4c._2022server.mapper.StoreHeaderMapper;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/selectOption")
public class SelectOptionController {
    @Autowired
    RankByStoreMapper rankByStoreMapper;
    @Autowired
    MenuHeaderMapper menuHeaderMapper;
    @Autowired
    StoreHeaderMapper storeHeaderMapper;

    @GetMapping("/ranks")
    public ResponseEntity<List<SelectOption>> getRanksOptions(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);

        // 店舗IDに紐づくランク一覧を取得する
        RankByStoreExample rankByStoreExample = new RankByStoreExample();
        rankByStoreExample.createCriteria().andStoreIdEqualTo(storeId);
        List<RankByStore> rankList = rankByStoreMapper.selectByExample(rankByStoreExample);

        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 初期値の選択肢を追加
        SelectOption selectOption = new SelectOption();
        selectOption.setCode(null);
        selectOption.setName("");
        selectOptionList.add(selectOption);

        // 検索結果全件に対しての処理
        for (RankByStore rank : rankList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            tempSelectOption.setCode(rank.getRankId()); // ランクID
            tempSelectOption.setName(rank.getRank()); // ランク名称
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }

        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/menus")
    public ResponseEntity<List<SelectOption>> getMenusOptions(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);

        // 店舗IDに紐づくメニュー一覧を取得する
        MenuHeaderExample menuHeaderExample = new MenuHeaderExample();
        menuHeaderExample.createCriteria().andStoreIdEqualTo(storeId);
        List<MenuHeader> menuList = menuHeaderMapper.selectByExample(menuHeaderExample);

        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対しての処理
        for (MenuHeader menu : menuList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            tempSelectOption.setCode(menu.getMenuId()); // メニューID
            tempSelectOption.setName(menu.getMenu()); // メニュー名称
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/reserveStates")
    public ResponseEntity<List<SelectOption>> getReserveStatesOptions() {
        // 予約状態Enum取得
        ReserveStateEnum[] enumArray = ReserveStateEnum.values();

        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対しての処理
        for (ReserveStateEnum e : enumArray) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            tempSelectOption.setCode(e.getCode()); // コード値
            tempSelectOption.setName(e.getName()); // 名称
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/gender")
    public ResponseEntity<List<SelectOption>> getGenderOptions() {
        // 性別Enum取得
    	GenderEnum[] enumArray = GenderEnum.values();

        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対しての処理
        for (GenderEnum e : enumArray) {
            // SelectOptionに以下の値を設定する
            SelectOption tempSelectOption = new SelectOption();
            tempSelectOption.setCode(e.getCode()); // コード値
            tempSelectOption.setName(e.getName()); // 名称
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }
    
    @GetMapping("/prefectureId")
    public ResponseEntity<List<SelectOption>> getPrefectureIdOptions() {
    	// 都道府県Enum取得
    	PrefectureIdEnum[] enumArray = PrefectureIdEnum.values();
    	
    	// 選択肢一覧を格納するリストをnewする
    	List<SelectOption> selectOptionList = new ArrayList<>();
    	// 検索結果全件に対しての処理
    	for (PrefectureIdEnum e : enumArray) {
    		// SelectOptionに以下の値を設定する
    		SelectOption tempSelectOption = new SelectOption();
    		tempSelectOption.setCode(e.getCode()); // コード値
    		tempSelectOption.setName(e.getName()); // 名称
    		// selectOptionListに追加
    		selectOptionList.add(tempSelectOption);
    	}
    	return ResponseEntity.ok(selectOptionList);
    }
    
//    @GetMapping("/storeNames")
//    public ResponseEntity<List<SelectOption>> getStoreNamesOptions() {
//        // 店舗名取得
//        List<StoreHeader0001> storeNameList = storeHeaderMapper.select0001();
//        List<SelectOption> selectOptionList = new ArrayList<>();
//
//        // 初期値の選択肢を追加
//        SelectOption selectOption = new SelectOption();
//        selectOption.setCode(null);
//        selectOption.setName("指定なし");
//        selectOptionList.add(selectOption);
//
//        int count = 1;
//        // 検索結果全件に対しての処理
//        for (StoreHeader0001 storeName : storeNameList) {
//            SelectOption tempSelectOption = new SelectOption();
//            // selectOptionFormに以下の値を設定
//            String code = String.valueOf(count);
//            tempSelectOption.setCode(1);
//            tempSelectOption.setName(storeName.getStoreName());
//            // selectOptionListに追加
//            selectOptionList.add(tempSelectOption);
//            count++;
//        }
//        return ResponseEntity.ok(selectOptionList);
//    }
  
}
