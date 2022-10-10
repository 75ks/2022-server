package com.c4c._2022server.form;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CustomerListFormReq {
    /** 顧客ID */
    private Integer customerId;

    /** 顧客名 */
    private String customerName;
    private String lastName;
    private String firstName;


    /** 顧客名(カナ) */
    private String customerNameKana;
    private String lastNameKana;
    private String firstNameKana;

    private LocalDate birthday;

    /** 年齢 */
    private Integer age;

    /** 性別 */
    private Integer gender;

    private String postalCode;
    private Integer prefectureId;
    private String address1;
    private String address2;
    private String address3;
    private String phoneNumber;
    private String email;
}
