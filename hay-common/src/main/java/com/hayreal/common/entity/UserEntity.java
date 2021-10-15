package com.hayreal.common.entity;

import com.hayreal.common.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class UserEntity extends BaseEntity {
    private String userName;

    private String password;

    private Date birthDate;

    private String phone;
}
