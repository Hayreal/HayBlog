package com.hayreal.common.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date createTime;

    private Date updateTime;

    private String updateBy;

    private String createBy;
}
