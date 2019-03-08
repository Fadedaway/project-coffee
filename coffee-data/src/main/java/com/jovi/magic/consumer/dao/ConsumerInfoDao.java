package com.jovi.magic.consumer.dao;

import com.jovi.magic.common.dao.BaseJpaRepository;
import com.jovi.magic.consumer.entity.ConsumerInfo;
import org.springframework.stereotype.Repository;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Repository
public interface ConsumerInfoDao extends BaseJpaRepository<ConsumerInfo, Long> {
}
