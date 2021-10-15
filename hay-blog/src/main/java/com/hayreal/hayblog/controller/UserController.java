package com.hayreal.hayblog.controller;


import com.hayreal.common.base.Result;
import com.hayreal.hayblog.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "user相关接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @PostMapping("/login")
    @ApiOperation("登录--login")
    public Result login(String userName,String password){
        return userService.login(userName,password);
    }

    @GetMapping("/logout")
    @ApiOperation("登出--logout")
    public Result logout(String userName,String password){
        return userService.login(userName,password);
    }
}
