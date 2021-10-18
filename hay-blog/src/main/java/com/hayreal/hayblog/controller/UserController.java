package com.hayreal.hayblog.controller;


import com.hayreal.common.base.Result;
import com.hayreal.common.entity.vo.UserVo;
import com.hayreal.hayblog.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户相关接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @PostMapping("/login")
    @ApiOperation("登录--login用 手机号15079068013 密码admin123")
    public Result login(@RequestBody UserVo userVo){
        return userService.login(userVo);
    }

//    @GetMapping("/logout")
//    @ApiOperation("登出--logout")
//    public Result logout(String userName,String password){
//        return userService.login(userName,password);
//    }
}
