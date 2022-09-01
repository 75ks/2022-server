package com.c4c._2022server.utils;

import java.lang.reflect.Field;

import org.springframework.stereotype.Component;

import lombok.SneakyThrows;

@Component
public class EntityUtils {
    /**
     * 削除フラグ
     */
    final String DELETE_FLG = "deleteFlg";
    /**
     * 作成日時
     */
    final String CREATED_DATETIME = "createdDatetime";
    /**
     * 作成者ID
     */
    final String CREATED_USER = "createdUser";
    /**
     * 更新日時
     */
    final String UPDATE_DATETIME = "updateDatetime";
    /**
     * 更新者ID
     */
    final String UPDATE_USER = "updateUser";
    /**
     * 排他制御カラム
     */
    final String VERSION_EX_KEY = "versionExKey";

    /**
     * INSERT時の共通設定
     * @param <T>
     * @param entity
     * @param id
     */
    @SneakyThrows
    public <T> void setColumns4Insert(T entity, Integer id) {
        Field[] declaredFields = entity.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            switch (declaredField.getName()) {
                case DELETE_FLG:
                    declaredField.setAccessible(true); // privateな変数でもアクセスできるようにする
                    declaredField.set(entity, CommonUtils.OFF);
                    break;
                case CREATED_DATETIME:
                case UPDATE_DATETIME:
                    declaredField.setAccessible(true); // privateな変数でもアクセスできるようにする
                    declaredField.set(entity, CommonUtils.CURRENT_DATE_TIME);
                    break;
                case CREATED_USER:
                case UPDATE_USER:
                    declaredField.setAccessible(true); // privateな変数でもアクセスできるようにする
                    declaredField.set(entity, id);
                    break;
                case VERSION_EX_KEY:
                    declaredField.setAccessible(true); // privateな変数でもアクセスできるようにする
                    declaredField.set(entity, 0);
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * UPDATE時の共通設定
     * @param <T>
     * @param entity
     * @param id
     */
    @SneakyThrows
    public <T> void setColumns4Update(T entity, Integer id) {
        Field[] declaredFields = entity.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            switch (declaredField.getName()) {
                case UPDATE_DATETIME:
                    declaredField.setAccessible(true); // privateな変数でもアクセスできるようにする
                    declaredField.set(entity, CommonUtils.CURRENT_DATE_TIME);
                    break;
                case UPDATE_USER:
                    declaredField.setAccessible(true); // privateな変数でもアクセスできるようにする
                    declaredField.set(entity, id);
                    break;
                default:
                    break;
            }
        }
    }
}
