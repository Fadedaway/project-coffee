package com.jovi.magic.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
public enum ArticleStatusEnum {

    COMMITTED("COMMITTED", "已提交"),    // 已提交
    AUDITED("AUDITED", "已审核"),  // 已审核
    REJECTED("REJECTED", "审核不通过")    // 审核不通过
    ;

    @Getter
    @Setter
    private String value;
    @Getter
    @Setter
    private String label;

    ArticleStatusEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
