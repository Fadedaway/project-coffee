package com.jovi.magic.role.dao;

import com.jovi.magic.common.dao.BaseJpaRepository;
import com.jovi.magic.common.enums.StatusEnum;
import com.jovi.magic.role.entity.RoleInfo;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Repository
public interface RoleInfoDao extends BaseJpaRepository<RoleInfo, Long> {

    List<RoleInfo> findByIdInAndStatus(Collection<Long> roleIds, StatusEnum status);
}
