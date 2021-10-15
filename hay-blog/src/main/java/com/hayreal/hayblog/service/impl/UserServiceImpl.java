package com.hayreal.hayblog.service.impl;

import com.hayreal.common.base.Result;
import com.hayreal.common.base.ResultMsgEnum;
import com.hayreal.hayblog.mapper.UserMapper;
import com.hayreal.hayblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public Result login(String userName, String password) {
        // TODO 在校验成功后生成token存入redis，同时返回给前端，每次前台发起请求就带上token
        String pwd = userMapper.findPasswordByUid(userName);
        if (!password.equals(pwd)){
            return Result.error(-1,"密码错误");
        }
        return Result.success(ResultMsgEnum.SUCCESS);
    }
}
