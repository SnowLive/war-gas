package org.decade.gas.convert;

import org.decade.gas.bean.db.index.NewsBean;
import org.decade.gas.entity.index.NewsEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
public class NewsConvert {

    public static NewsBean entity2Bean(NewsEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, NewsBean.class);
    }

    public static List<NewsBean> enList2BeanList(List<NewsEntity> entityList) {
        if (entityList == null) return null;
        List<NewsBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}

