package com.hayreal.common.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Date createTime;

    private Date updateTime;

    private String updateBy;

    private String createBy;
}
