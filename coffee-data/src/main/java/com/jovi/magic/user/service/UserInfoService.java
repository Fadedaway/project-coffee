package com.jovi.magic.user.service;

import com.jovi.magic.user.entity.UserInfo;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
public interface UserInfoService {

    /**
     * 根据手机号码查询用户
     * @param userMobile 用户手机号码
     * @return UserInfo
     */
    UserInfo findByUserMobile(String userMobile);

    void setUpAdmin(String mobile, String password);
}
