package com.jovi.magic.common;

import com.jovi.magic.common.enums.StatusEnum;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    private Date createTime;

    @CreatedBy
    private String creator;

    @LastModifiedDate
    private Date updateTime;

    @LastModifiedBy
    private String updator;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private StatusEnum status;

    @Version
    private Long version;
}
