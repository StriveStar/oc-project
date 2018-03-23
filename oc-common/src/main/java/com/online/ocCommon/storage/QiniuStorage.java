package com.online.ocCommon.storage;

public class QiniuStorage {

    public static String uploadImage(byte[] buff){
        String key = QiniuKeyGenerator.generateKey();
        key = QiniuWrapper.upload(buff, key, false);
        return key;
    }
}
