//package com.c4c._2022server.service.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.c4c._2022server.constants.ReserveState;
//import com.c4c._2022server.entity.ReserveHistory0001;
//import com.c4c._2022server.form.CustomerCreateFormRes;
//import com.c4c._2022server.form.ReserveHistoryFormRes;
//import com.c4c._2022server.mapper.CustomerCreateMapper;
//import com.c4c._2022server.service.CustomerCreateService;
//
//@Service
//public class CustomerCreateServiceImpl implements CustomerCreateService {
//    @Autowired
//    CustomerCreateMapper customerCreateMapper;
//
//    /**
//     * 予約履歴一覧取得
//     * @return null
//     */
//    public List<CustomerCreateFormRes> index() {
//        // SELECT文を実行し、データを取得する
//        List<ReserveHistory0001> reserveHistoryList = CustomerCreateMapper.select0001();
//        // Formにデータを詰める
//        List<ReserveHistoryFormRes> resFormList = new ArrayList<>();
//        for (ReserveHistory0001 reserveHistory0001 : reserveHistoryList) {
//            ReserveHistoryFormRes resForm = new ReserveHistoryFormRes();
//            resForm.setReserveHistoryId(reserveHistory0001.getReserveHistoryId());
//            resForm.setRank(reserveHistory0001.getRank());
//            resForm.setMenu(reserveHistory0001.getMenu());
//            resForm.setPrice(reserveHistory0001.getPrice());
//            resForm.setReserveDatetime(reserveHistory0001.getReserveDatetime());
//            resForm.setReserveState(ReserveState.MAP.get(reserveHistory0001.getReserveState()));
//            resForm.setCustomerLastName(reserveHistory0001.getCustomerLastName());
//            resForm.setCustomerFirstName(reserveHistory0001.getCustomerFirstName());
//            resForm.setCustomerLastNameKana(reserveHistory0001.getCustomerLastNameKana());
//            resForm.setCustomerFirstNameKana(reserveHistory0001.getCustomerFirstNameKana());
//            resForm.setStuffLastName(reserveHistory0001.getStuffLastName());
//            resForm.setStuffFirstName(reserveHistory0001.getStuffFirstName());
//            resForm.setStuffLastNameKana(reserveHistory0001.getStuffLastNameKana());
//            resForm.setStuffFirstNameKana(reserveHistory0001.getStuffFirstNameKana());
//            resFormList.add(resForm);
//        }
//        return resFormList;
//    }
//}
