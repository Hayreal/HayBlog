package com.hayreal.common.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVo {

    private Long id;

    private String userName;

    private String password;

    private Date birthDate;

    private String phone;


}
