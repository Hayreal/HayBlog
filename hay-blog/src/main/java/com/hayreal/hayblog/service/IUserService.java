package com.hayreal.hayblog.service;

import com.hayreal.common.base.Result;
import com.hayreal.hayblog.domain.UserVo;

public interface IUserService {

    Result login(String userName, String password);
}
