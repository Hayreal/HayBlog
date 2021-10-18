package com.hayreal.hayblog.service.impl;

import com.hayreal.common.base.Result;
import com.hayreal.common.base.ResultMsgEnum;
import com.hayreal.common.entity.User;
import com.hayreal.common.entity.vo.UserVo;
import com.hayreal.hayblog.core.TokenService;
import com.hayreal.hayblog.mapper.UserMapper;
import com.hayreal.hayblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TokenService tokenService;

    public Result login(UserVo userVo) {
        // TODO 在校验成功后生成token存入redis，同时返回给前端，每次前台发起请求就带上token
        User user = userMapper.getUserByPhone(userVo.getPhone());
        if (user == null){
            return Result.error(ResultMsgEnum.FAIL.getCode(),"没有此用户");
        }else {
            // 校验密码
            if (!user.getPassword().equals(userVo.getPassword())){
                //密码错误
                return Result.error(ResultMsgEnum.FAIL.getCode(),"密码错误");
            }
        }

        //创建token返回给前端
        Map map = tokenService.createToken(userVo);

        return Result.success(map);
    }
}

