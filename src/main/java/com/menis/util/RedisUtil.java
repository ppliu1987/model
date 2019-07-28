package com.menis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis工具类
 *
 */
@SuppressWarnings("unchecked")
@Component("redisUtil")
public class RedisUtil {

    @Autowired//(自动注入redisTemplet)
    private RedisTemplate<String, Object> redisTemplate;

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public boolean hasKey(String key){
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    public String get(String key) {
        Object obj = redisTemplate.opsForHash().get(key, key);
        if(obj == null){
            return null;
        }else{
            return String.valueOf(obj);
        }
    }


}