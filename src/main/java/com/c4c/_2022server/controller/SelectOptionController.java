package com.c4c._2022server.controller;

import java.util.ArrayList;
import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
import com.c4c._2022server.entity.MenuHeader;
import com.c4c._2022server.entity.MenuHeader0001;
import com.c4c._2022server.entity.MenuHeaderExample;
import com.c4c._2022server.entity.RankByStore;
import com.c4c._2022server.entity.RankByStoreExample;
import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.entity.StuffExample;
import com.c4c._2022server.enums.GenderEnum;
import com.c4c._2022server.enums.NumberOfDisplayEnum;
import com.c4c._2022server.enums.PrefectureIdEnum;
import com.c4c._2022server.enums.ReserveStateEnum;
import com.c4c._2022server.form.SelectOption;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.mapper.MenuHeaderMapper;
import com.c4c._2022server.mapper.RankByStoreMapper;
import com.c4c._2022server.mapper.StoreHeaderMapper;
import com.c4c._2022server.mapper.StuffMapper;
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
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    StuffMapper stuffMapper;

    /**
     * ランクプルダウン取得
     * @param jwt トークン
     * @return ランク情報
     * @throws AuthenticationException
     */
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

    /**
     * メニュープルダウン取得
     * @param jwt トークン(スタッフ用)
     * @param customerJwt トークン(顧客用)
     * @return　メニュー情報
     * @throws AuthenticationException
     */
    @GetMapping("/menus")
    public ResponseEntity<List<SelectOption>> getMenusOptions(@RequestHeader("Authorization") String jwt, @RequestHeader("CustomerAuthorization") String customerJwt) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = jwt.length() > 7 ? instance.getStoreId(jwt) : instance.getStoreId(customerJwt);

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

    /**
     * メニュー料金プルダウン取得
     * @param jwt トークン(スタッフ用)
     * @param customerJwt トークン(顧客用)
     * @param rankId ランクID
     * @return メニュー料金情報
     * @throws AuthenticationException
     */
    @GetMapping("/menuPrice")
    public ResponseEntity<List<SelectOption>> getMenuPriceOptions(@RequestHeader("Authorization") String jwt, @RequestHeader("CustomerAuthorization") String customerJwt, @RequestParam(name = "rankId", required = true) Integer rankId) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = jwt.length() > 7 ? instance.getStoreId(jwt) : instance.getStoreId(customerJwt);
        
        // 店舗IDに紐づくメニュー＆料金一覧を取得する
        List<MenuHeader0001> menuPriceList = menuHeaderMapper.select0001(storeId, rankId);
        
        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対しての処理
        for (MenuHeader0001 menuPrice : menuPriceList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            tempSelectOption.setCode(menuPrice.getMenuId()); // メニューID
            tempSelectOption.setName(menuPrice.getMenu() + " : " + menuPrice.getPrice() + "円"); // メニュー名称
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    /**
     * 予約状態プルダウン取得
     * @return 予約状態情報
     */
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

    /**
     * 性別プルダウン取得
     * @return 性別情報
     */
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

    /**
     * 都道府県プルダウン取得
     * @return 都道府県情報
     */
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

    /**
     * 表示件数プルダウン取得
     * @return 表示件数情報
     */
    @GetMapping("/numberOfDisplay")
    public ResponseEntity<List<SelectOption>> getNumberOfDisplayOptions() {
        // 表示件数Enum取得
        NumberOfDisplayEnum[] enumArray = NumberOfDisplayEnum.values();
        
        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対しての処理
        for (NumberOfDisplayEnum e : enumArray) {
            // SelectOptionに以下の値を設定する
            SelectOption tempSelectOption = new SelectOption();
            tempSelectOption.setCode(e.getCode()); // コード値
            tempSelectOption.setName(e.getName()); // 名称
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    /**
     * 顧客プルダウン取得
     * @param jwt トークン
     * @return 顧客情報
     * @throws AuthenticationException
     */
    @GetMapping("/customers")
    public ResponseEntity<List<SelectOption>> getCustomersOptions(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);

        // 店舗IDに紐づく顧客一覧を取得する
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andStoreIdEqualTo(storeId);
        List<Customer> customerList = customerMapper.selectByExample(customerExample);

        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対しての処理
        for (Customer customer : customerList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            tempSelectOption.setCode(customer.getCustomerId()); // 顧客ID
            tempSelectOption.setName(customer.getLastName() + " " + customer.getFirstName()); // 顧客名
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    /**
     * スタッフプルダウン取得
     * @param jwt トークン(スタッフ用)
     * @param customerJwt トークン(顧客用)
     * @return スタッフ情報
     * @throws AuthenticationException
     */
    @GetMapping("/stuffs")
    public ResponseEntity<List<SelectOption>> getStuffsOptions(@RequestHeader("Authorization") String jwt, @RequestHeader("CustomerAuthorization") String customerJwt) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = jwt.length() > 7 ? instance.getStoreId(jwt) : instance.getStoreId(customerJwt);

        // 店舗IDに紐づくスタッフ一覧を取得する
        StuffExample stuffExample = new StuffExample();
        stuffExample.createCriteria().andStoreIdEqualTo(storeId);
        List<Stuff> stuffList = stuffMapper.selectByExample(stuffExample);

        // 選択肢一覧を格納するリストをnewする
        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対しての処理
        for (Stuff stuff : stuffList) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定
            tempSelectOption.setCode(stuff.getStuffId()); // スタッフID
            tempSelectOption.setName(stuff.getLastName() + " " + stuff.getFirstName()); // スタッフ名
            // selectOptionListに追加
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }
}
