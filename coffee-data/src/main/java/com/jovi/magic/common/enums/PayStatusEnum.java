package com.jovi.magic.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
public enum PayStatusEnum {

    TO_BE_PAID("TO_BE_PAID", "待支付"),
    PAID("PAID", "已支付"),
    CANCELLED("CANCELLED", "已取消");

    @Getter
    @Setter
    private String value;
    @Getter
    @Setter
    private String label;

    PayStatusEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
