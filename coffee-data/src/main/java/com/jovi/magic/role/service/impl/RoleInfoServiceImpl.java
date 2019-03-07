package com.jovi.magic.role.service.impl;

import com.jovi.magic.common.enums.StatusEnum;
import com.jovi.magic.role.dao.RoleInfoDao;
import com.jovi.magic.role.dao.UserRoleRelDao;
import com.jovi.magic.role.entity.RoleInfo;
import com.jovi.magic.role.entity.UserRoleRel;
import com.jovi.magic.role.service.RoleInfoService;
import com.jovi.magic.user.dao.UserInfoDao;
import com.jovi.magic.user.entity.UserInfo;
import com.jovi.magic.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    private RoleInfoDao roleInfoDao;

    @Autowired
    private UserRoleRelDao userRoleRelDao;

    @Override
    public List<RoleInfo> getRoleByUserId(Long userId) {
        if (Objects.isNull(userId))
            return new ArrayList<>();

        Set<Long> roleIds = userRoleRelDao.findByUserIdAndStatus(userId, StatusEnum.A)
                .stream().map(UserRoleRel::getRoleId).collect(Collectors.toSet());

        return roleInfoDao.findByIdInAndStatus(roleIds, StatusEnum.A);
    }
}
