package com.hmc.searchmanager.common.utils;

/**
 * Redis所有Keys
 *
 * @author liangchangchun
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
