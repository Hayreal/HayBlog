package com.hayreal.common.entity;

import com.hayreal.common.base.BaseEntity;
import lombok.Data;

@Data
public class Comment extends BaseEntity {

    /**
     * 评论id
     */
    private Long id;

    /**
     * 博客id
     */
    private Long blogId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 点赞数
     */
    private Integer thumb;

}
