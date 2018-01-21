package org.decade.gas.convert;

import org.decade.gas.bean.db.index.OfficialsBean;
import org.decade.gas.entity.index.OfficialsEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
public class OfficialsConvert {

    public static OfficialsBean entity2Bean(OfficialsEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, OfficialsBean.class);
    }

    public static List<OfficialsBean> enList2BeanList(List<OfficialsEntity> entityList) {
        if (entityList == null) return null;
        List<OfficialsBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}

