package com.jovi.magic.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
public enum EnableEnum {

    Y("Y", "Enable"),
    N("N", "Disable");

    @Getter
    @Setter
    private String value;
    @Getter
    @Setter
    private String label;

    EnableEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
