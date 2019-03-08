package com.jovi.magic.article.entity;

import com.jovi.magic.common.BaseEntity;
import com.jovi.magic.common.enums.ArticleStatusEnum;
import com.jovi.magic.common.enums.EnableEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Data
@Entity
@Table(name = "article_info")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class ArticleInfo extends BaseEntity {

    private static final long serialVersionUID = 8994872463650105211L;

    /**
     * 文章标题
     */
    @Column(name = "article_title")
    private String articleTitle;

    /**
     * 文章内容
     */
    @Column(name = "article_content")
    private String articleContent;

    /**
     * 文章发布/审核状态
     */
    @Column(name = "article_status")
    @Enumerated(value = EnumType.STRING)
    private ArticleStatusEnum articleStatus;

    /**
     * 文章发布者 consumerId
     */
    @Column(name = "article_publisher")
    private Long articlePublisher;

    /**
     * 是否允许回复
     */
    @Column(name = "reply_status")
    @Enumerated(value = EnumType.STRING)
    private EnableEnum replyStatus;
}
