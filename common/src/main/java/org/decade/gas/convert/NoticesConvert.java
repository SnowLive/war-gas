package org.decade.gas.convert;

import org.decade.gas.bean.db.index.NoticesBean;
import org.decade.gas.entity.index.NoticesEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-2
 */
public class NoticesConvert {
    public static NoticesBean entity2Bean(NoticesEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, NoticesBean.class);
    }

    public static List<NoticesBean> enList2BeanList(List<NoticesEntity> entityList) {
        if (entityList == null) return null;
        List<NoticesBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}
