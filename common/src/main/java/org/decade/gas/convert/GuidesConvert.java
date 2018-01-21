package org.decade.gas.convert;

import org.decade.gas.bean.db.index.GuidesBean;
import org.decade.gas.entity.index.GuidesEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
public class GuidesConvert {

    public static GuidesBean entity2Bean(GuidesEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, GuidesBean.class);
    }

    public static List<GuidesBean> enList2BeanList(List<GuidesEntity> entityList) {
        if (entityList == null) return null;
        List<GuidesBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}

