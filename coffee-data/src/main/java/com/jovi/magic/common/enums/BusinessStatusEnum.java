package com.jovi.magic.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
public enum BusinessStatusEnum {

    OPEN("OPEN", "营业中"),
    CLOSE("CLOSE", "歇业中");

    @Getter
    @Setter
    private String value;
    @Getter
    @Setter
    private String label;

    BusinessStatusEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
