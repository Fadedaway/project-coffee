package com.jovi.magic.role.service;

import com.jovi.magic.role.entity.RoleInfo;

import java.util.List;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
public interface RoleInfoService {

    /**
     * 根据用户id获取角色
     * @param userId 用户id
     * @return List
     */
    List<RoleInfo> getRoleByUserId(Long userId);
}
