package com.jovi.magic.consumer.entity;

import com.jovi.magic.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Data
@Entity
@Table(name = "consumer_info")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class ConsumerInfo extends BaseEntity {

    private static final long serialVersionUID = -3811101540425182316L;

    /**
     * 消费者姓名
     */
    @Column(name = "consumer_name")
    private String consumerName;

    /**
     * 消费者昵称
     */
    @Column(name = "consumer_nickname")
    private String consumerNickname;

    /**
     * 消费者openId
     */
    @Column(name = "consumer_openid")
    private String consumerOpenid;

    /**
     * 最后一次采集的定位位置
     */
    @Column(name = "last_position")
    private String lastPosition;

    /**
     * 经度
     */
    @Column(name = "last_lon")
    private BigDecimal lastLon;

    /**
     * 纬度
     */
    @Column(name = "last_lat")
    private BigDecimal lastLat;
}
