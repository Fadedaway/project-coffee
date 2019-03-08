package com.jovi.magic.user.entity;

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
@Table
@Entity
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class UserInfo extends BaseEntity {

    private static final long serialVersionUID = 2852686797043661592L;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户手机号
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户密码
     */
    @Column(name = "user_mobile")
    private String userMobile;

    /**
     * 用户头像
     */
    @Column(name = "user_avatar")
    private String userAvatar;

    /**
     * 用户擅长
     */
    @Column(name = "user_ability")
    private String userAbility;

    /**
     * 咖啡师等级
     */
    @Column(name = "coffee_level")
    private String coffeeLevel;
}
