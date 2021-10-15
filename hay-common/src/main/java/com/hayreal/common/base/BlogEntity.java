package com.hayreal.common.base;

import lombok.Data;

@Data
public class BlogEntity extends BaseEntity{
    private long id;

    private String tittle;

    private String tags_ids;
}
