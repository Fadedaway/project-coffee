package com.jovi.magic.order.entity;

import com.jovi.magic.common.BaseEntity;
import com.jovi.magic.common.enums.PayStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Data
@Entity
@Table(name = "order_info")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class OrderInfo extends BaseEntity {

    private static final long serialVersionUID = -4016083281469821882L;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 总价(分)
     */
    @Column(name = "total_price")
    private Long totalPrice;

    /**
     * 优惠/折扣价
     */
    @Column(name = "discount_price")
    private Long discountPrice;

    /**
     * 最终支付价
     */
    @Column(name = "pay_price")
    private Long payPrice;

    /**
     * 支付状态
     * @see PayStatusEnum
     */
    @Column(name = "pay_status")
    @Enumerated(EnumType.STRING)
    private PayStatusEnum payStatus;

    /**
     * 消费者id
     */
    @Column(name = "consumer_id")
    private Long consumerId;

    /**
     * 店铺id
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;
}
