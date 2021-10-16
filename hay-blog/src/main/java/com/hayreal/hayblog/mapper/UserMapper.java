package com.hayreal.hayblog.mapper;

import com.hayreal.common.entity.User;

public interface UserMapper {
    User getUserByPhone(String phone);
}
