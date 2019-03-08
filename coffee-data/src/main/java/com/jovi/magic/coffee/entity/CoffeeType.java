package com.jovi.magic.coffee.entity;

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
 * @date Created on 2019/3/8
 */
@Data
@Entity
@Table(name = "coffee_type")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class CoffeeType extends BaseEntity {

    private static final long serialVersionUID = 6564379291055230366L;

    /**
     * 咖啡分类名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 咖啡分类封面图片
     */
    @Column(name = "type_cover")
    private String typeCover;
}
