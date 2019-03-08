package com.jovi.magic.article.entity;

import com.jovi.magic.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Data
@Entity
@Table(name = "article_comments")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class ArticleComments extends BaseEntity {

    private static final long serialVersionUID = -1052824587400584463L;

    /**
     * 文章id
     */
    @Column(name = "article_id")
    private Long articleId;

    /**
     * 是否是文章直属评论 1：是， 0：否
     */
    @Column(name = "directly")
    private Integer directly;

    /**
     * 父评论id
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 评论者id consumerId
     */
    @Column(name = "replier_id")
    private Long replierId;

    /**
     * 文章评论
     */
    @Column(name = "article_comments")
    private String articleComments;
}
