package com.jovi.magic.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
public enum StatusEnum {

    A("A", "Active"),
    D("D", "Deleted");

    @Getter
    @Setter
    private String value;
    @Getter
    @Setter
    private String label;

    StatusEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }}
