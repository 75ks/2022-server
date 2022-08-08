package com.c4c._2022server.enums;

import java.util.Arrays;
import java.util.Objects;

public enum PrefectureIdEnum implements EnumBase {
	HOKKAIDO(1, "北海道"),
	AOMORI(2, "青森県"),
	IWATE(3, "岩手県"),
	MIYAGI(4, "宮城県"),
	AKITA(5, "秋田県"),
	YAMAGATA(6, "山形県"),
	Fukushima(7, "福島県"),
	Ibaraki(8, "茨城県"),
	Tochigi(9, "栃木県"),
	Gumma(10, "群馬県"),
	Saitama(11, "埼玉県"),
	Chiba(12, "千葉県"),
	Tokyo(13, "東京都"),
	Kanagawa(14, "神奈川県"),
	Niigata(15, "新潟県"),
	Toyama(16, "富山県"),
	Ishikawa(17, "石川県"),
	Fukui(18, "福井県"),
	Yamanashi(19, "山梨県"),
	Nagano(20, "長野県"),
	Gifu(21, "岐阜県"),
	Shizuoka(22, "静岡県"),
	Aichi(23, "愛知県"),
	Mie(24, "三重県"),
	Shiga(25, "滋賀県"),
	Kyoto(26, "京都府"),
	Osaka(27, "大阪府"),
	Hyogo(28, "兵庫県"),
	Nara(29, "奈良県"),
	Wakayama(30, "和歌山県"),
	Tottori(31, "鳥取県"),
	Shimane(32, "島根県"),
	Okayama(33, "岡山県"),
	Hiroshima(34, "広島県"),
	Yamaguchi(35, "山口県"),
	Tokushima(36, "徳島県"),
	Kagawa(37, "香川県"),
	Ehime(38, "愛媛県"),
	Kochi(39, "高知県"),
	Fukuoka(40, "福岡県"),
	Saga(41, "佐賀県"),
	Nagasaki(42, "長崎県"),
	Kumamoto(43, "熊本県"),
	Oita(44, "大分県"),
	Miyazaki(45, "宮崎県"),
	Kagoshima(46, "鹿児島県"),
	Okinawa(47, "沖縄県");

    private final Integer code;
    private final String name;

    PrefectureIdEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static PrefectureIdEnum getEnumByCode(Integer code) {
        return Arrays.stream(values())
                .filter(enumeration -> Objects.equals(enumeration.code, code))
                .findFirst()
                .orElse(null);
    }
}
