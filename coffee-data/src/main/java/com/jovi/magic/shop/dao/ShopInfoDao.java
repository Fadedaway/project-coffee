package com.jovi.magic.shop.dao;

import com.jovi.magic.common.dao.BaseJpaRepository;
import com.jovi.magic.shop.entity.ShopInfo;
import org.springframework.stereotype.Repository;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Repository
public interface ShopInfoDao extends BaseJpaRepository<ShopInfo, Long> {
}
