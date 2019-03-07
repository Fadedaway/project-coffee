package com.jovi.magic.user.dao;

import com.jovi.magic.common.dao.BaseJpaRepository;
import com.jovi.magic.common.enums.StatusEnum;
import com.jovi.magic.user.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@Repository
public interface UserInfoDao extends BaseJpaRepository<UserInfo, Long> {

    UserInfo findByUserMobileAndStatus(String userMobile, StatusEnum status);
}
