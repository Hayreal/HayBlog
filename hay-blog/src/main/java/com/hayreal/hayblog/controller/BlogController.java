package com.hayreal.hayblog.controller;

import com.hayreal.common.base.Result;
import com.hayreal.common.entity.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/blog")
@Api(tags = "博客相关接口")
@RestController
public class BlogController {


    @GetMapping("/list")
    @ApiOperation("博客列表--list")
    public Result blogList(UserVo userVo){
        return null;
    }

}
