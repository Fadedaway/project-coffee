package com.jovi.magic.coffee.entity;

import com.jovi.magic.common.BaseEntity;
import com.jovi.magic.common.enums.EnableEnum;
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
@Table(name = "coffee_info")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class CoffeeInfo extends BaseEntity {

    private static final long serialVersionUID = 4126954154261001417L;

    /**
     * 咖啡名称
     */
    @Column(name = "coffee_name")
    private String coffeeName;

    /**
     * 咖啡分类
     */
    @Column(name = "coffee_type_id")
    private Long coffeeTypeId;

    /**
     * 咖啡原材料
     */
    @Column(name = "coffee_material")
    private String coffeeMaterial;

    /**
     * 咖啡价格(分)
     */
    @Column(name = "coffee_price")
    private Long coffeePrice;

    /**
     * 是否可以使用优惠券
     */
    @Column(name = "discount_status")
    private EnableEnum discountStatus;

    /**
     * 是否是推荐咖啡
     */
    @Column(name = "recommend_status")
    private EnableEnum recommendStatus;

    /**
     * 咖啡封面
     */
    @Column(name = "coffee_cover")
    private String coffeeCover;
}
