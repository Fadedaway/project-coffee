package com.jovi.magic.role.entity;

import com.jovi.magic.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Data
@Entity
@Table(name = "user_role_rel")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class UserRoleRel extends BaseEntity {

    private static final long serialVersionUID = 6667204839954515039L;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;
}
