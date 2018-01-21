package org.decade.gas.convert;

import org.decade.gas.bean.db.index.PoliciesBean;
import org.decade.gas.entity.index.PoliciesEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-2
 */
public class PoliciesConvert {
    public static PoliciesBean entity2Bean(PoliciesEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, PoliciesBean.class);
    }

    public static List<PoliciesBean> enList2BeanList(List<PoliciesEntity> entityList) {
        if (entityList == null) return null;
        List<PoliciesBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}
