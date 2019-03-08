package com.jovi.magic.shop.entity;

import com.jovi.magic.common.BaseEntity;
import com.jovi.magic.common.enums.BusinessStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Data
@Entity
@Table(name = "shop_info")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class ShopInfo extends BaseEntity {

    private static final long serialVersionUID = -1105253621264949459L;

    /**
     * 店铺名称
     */
    @Column(name = "shop_name")
    private String shopName;

    /**
     * 店主id userId
     */
    @Column(name = "shop_owner")
    private Long shopOwner;

    /**
     * 店铺位置
     */
    @Column(name = "shop_location")
    private String shopLocation;

    /**
     * 店铺经度
     */
    @Column(name = "shop_lon")
    private BigDecimal shopLon;

    /**
     * 店铺纬度
     */
    @Column(name = "shop_lat")
    private BigDecimal shopLat;

    /**
     * 加盟日期
     */
    @Column(name = "join_time")
    private Date joinTime;

    /**
     * 营业状态，例：营业中，闭店
     * @see BusinessStatusEnum
     */
    @Column(name = "business_status")
    @Enumerated(EnumType.STRING)
    private BusinessStatusEnum businessStatus;
}
