package com.jovi.magic.role.entity;

import com.jovi.magic.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Data
@Entity
@Table(name = "role_info")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class RoleInfo extends BaseEntity {

    private static final long serialVersionUID = 8573557356895362564L;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色编码
     */
    @Column(name = "role_code")
    private String roleCode;
}
