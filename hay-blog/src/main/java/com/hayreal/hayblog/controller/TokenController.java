package com.hayreal.hayblog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class TokenController {

    @Autowired
    private RedisTemplate redisTemplate;


}
