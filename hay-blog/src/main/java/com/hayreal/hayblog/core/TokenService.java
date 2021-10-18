package com.hayreal.hayblog.core;

import com.hayreal.common.base.Result;
import com.hayreal.common.entity.vo.UserVo;
import com.hayreal.common.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
public class TokenService {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 创建token 并放入redis
     * @param userVo
     * @return
     */
    public Map createToken(UserVo userVo){
        String token = UUID.fastUUID().toString();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("token",token);
        map.put("outDate",10);

        redisTemplate.opsForValue().set(token,userVo,10, TimeUnit.SECONDS);
        return map;
    }

    /**
     * 校验token，失败则跳转到登陆界面
     * @param
     * @return
     */
    public Boolean checkToken(String token){
        if (redisTemplate.opsForValue().get(token) != null){
            return false;
        }

        return true;
    }
}
