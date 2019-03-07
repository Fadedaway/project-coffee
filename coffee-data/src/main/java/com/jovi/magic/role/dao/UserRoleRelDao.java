package com.jovi.magic.role.dao;

import com.jovi.magic.common.dao.BaseJpaRepository;
import com.jovi.magic.common.enums.StatusEnum;
import com.jovi.magic.role.entity.UserRoleRel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Repository
public interface UserRoleRelDao extends BaseJpaRepository<UserRoleRel, Long> {

    List<UserRoleRel> findByUserIdAndStatus(Long userId, StatusEnum status);
}
