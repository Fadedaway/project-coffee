package com.jovi.magic.financial.entity;

import com.jovi.magic.common.BaseEntity;
import com.jovi.magic.common.enums.FinancialRecordTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Data
@Entity
@Table(name = "financial_record")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class FinancialRecord extends BaseEntity {

    private static final long serialVersionUID = 5010149046932962561L;

    /**
     * 入账还是出账
     */
    @Column(name = "record_type")
    @Enumerated(EnumType.STRING)
    private FinancialRecordTypeEnum recordType;

    /**
     * 流水金额
     */
    @Column(name = "record_price")
    private Long recordPrice;

    /**
     * 变动后的总金额
     */
    @Column(name = "after_amount")
    private Long afterAmount;

    /**
     * 店铺id
     */
    @Column(name = "shop_id")
    private Long shopId;
}
