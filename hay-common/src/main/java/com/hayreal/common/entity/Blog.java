package com.hayreal.common.entity;

import com.hayreal.common.base.BaseEntity;
import lombok.Data;

@Data
public class Blog extends BaseEntity {
    private long id;

    private String tittle;

    private String tags_ids;
}
