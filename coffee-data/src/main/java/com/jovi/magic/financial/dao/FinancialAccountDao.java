package com.jovi.magic.financial.dao;

import com.jovi.magic.common.dao.BaseJpaRepository;
import com.jovi.magic.financial.entity.FinancialAccount;
import org.springframework.stereotype.Repository;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Repository
public interface FinancialAccountDao extends BaseJpaRepository<FinancialAccount, Long> {
}
