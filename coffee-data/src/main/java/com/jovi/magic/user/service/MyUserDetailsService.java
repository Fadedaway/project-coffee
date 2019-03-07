package com.jovi.magic.user.service;

import com.jovi.magic.role.entity.RoleInfo;
import com.jovi.magic.role.service.RoleInfoService;
import com.jovi.magic.user.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private RoleInfoService roleInfoService;

    @Override
    public UserDetails loadUserByUsername(String userMobile) throws UsernameNotFoundException {
        UserInfo userInfo = userInfoService.findByUserMobile(userMobile);

        if (Objects.isNull(userInfo)) {
            throw new UsernameNotFoundException(String.format("No user found with userMobile: %s", userMobile));
        }

        Set<GrantedAuthority> authorities = roleInfoService.getRoleByUserId(userInfo.getId())
                .stream().map(roleInfo -> new SimpleGrantedAuthority(roleInfo.getRoleCode())).collect(Collectors.toSet());
        return new User(userInfo.getUserMobile(), userInfo.getPassword(), userInfo.isEnabled(), userInfo.isAccountNonExpired(),
                userInfo.isCredentialsNonExpired(), userInfo.isAccountNonLocked(), authorities);
    }
}
