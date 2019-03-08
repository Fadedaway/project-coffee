package com.jovi.magic.order.dao;

import com.jovi.magic.common.dao.BaseJpaRepository;
import com.jovi.magic.order.entity.OrderCoffeeRel;
import org.springframework.stereotype.Repository;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Repository
public interface OrderCoffeeRelDao extends BaseJpaRepository<OrderCoffeeRel, Long> {
}
