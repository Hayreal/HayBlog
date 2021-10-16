package com.hayreal.hayblog.service;

import com.hayreal.common.base.Result;
import com.hayreal.common.entity.vo.UserVo;

public interface IUserService {

    Result login(UserVo userVo);
}
