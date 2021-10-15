package com.hayreal.hayblog.service;

import com.hayreal.common.base.Result;

public interface IBlogService {

    /**
     * 根据用户id查找该用户的文章列表
     * @param userId
     * @return
     */
    Result blogList(int userId);
}
