package com.jovi.magic.user.service.impl;

import com.jovi.magic.common.enums.StatusEnum;
import com.jovi.magic.user.dao.UserInfoDao;
import com.jovi.magic.user.entity.UserInfo;
import com.jovi.magic.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUserMobile(String userMobile) {
        return userInfoDao.findByUserMobileAndStatus(userMobile, StatusEnum.A);
    }

    @Override
    public void setUpAdmin(String mobile, String password) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("超级管理员");
        userInfo.setUserMobile(mobile);
        userInfo.setUserPassword(password);
        userInfo.setStatus(StatusEnum.A);
        userInfoDao.save(userInfo);
    }
}
