package com.jovi.magic.article.dao;

import com.jovi.magic.article.entity.ArticleInfo;
import com.jovi.magic.common.dao.BaseJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fanjiawei
 * @date Created on 2019/3/8
 */
@Repository
public interface ArticleInfoDao extends BaseJpaRepository<ArticleInfo, Long> {
}
