package org.decade.gas.convert;

import org.decade.gas.bean.db.index.PowersBean;
import org.decade.gas.entity.index.PowersEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *  行政职权类型转化
 * @auther: decade
 * @date: 18-1-1
 */
public class PowersConvert {

    public static PowersBean entity2Bean(PowersEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, PowersBean.class);
    }

    public static List<PowersBean> enList2BeanList(List<PowersEntity> entityList) {
        if (entityList == null) return null;
        List<PowersBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}

