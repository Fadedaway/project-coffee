package com.jovi.magic.order.entity;

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
@Table(name = "order_coffee_rel")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class OrderCoffeeRel extends BaseEntity {

    private static final long serialVersionUID = -968166390373220950L;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 咖啡id
     */
    @Column(name = "coffee_id")
    private Long coffeeId;

    /**
     * 购买数量
     */
    @Column(name = "quantity")
    private Integer quantity;

    /**
     * 单价
     */
    @Column(name = "unit_price")
    private Long unitPrice;
}
