package com.jovi.magic.user.entity;

import com.jovi.magic.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.util.Collection;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Data
@Table
@Entity
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class UserInfo extends BaseEntity implements UserDetails {

    private static final long serialVersionUID = 2852686797043661592L;

    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

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

    public void setUserPassword(String userPassword) {
        this.userPassword = PASSWORD_ENCODER.encode(userPassword);
    }

    public boolean matchPassword(String userPassword) {
        return PASSWORD_ENCODER.matches(userPassword, getPassword());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.userPassword;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
