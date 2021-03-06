package com.jovi.magic.coffee.dao;

import com.jovi.magic.coffee.entity.CoffeeType;
import com.jovi.magic.common.dao.BaseJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Repository
public interface CoffeeTypeDao extends BaseJpaRepository<CoffeeType, Long> {
}
