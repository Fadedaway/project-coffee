package com.jovi.magic.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
public enum FinancialRecordTypeEnum {

    IN("IN", "收入"),
    OUT("OUT", "支出");

    @Getter
    @Setter
    private String value;
    @Getter
    @Setter
    private String label;

    FinancialRecordTypeEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
