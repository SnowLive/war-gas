package org.decade.gas.convert;

import org.decade.gas.bean.db.index.FocusBean;
import org.decade.gas.entity.index.FocusEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 * 热点访谈数据类型转换
 * @auther: decade
 * @date: 18-1-2
 */
public class FocusConvert {

    public static FocusBean entity2Bean(FocusEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, FocusBean.class);
    }

    public static List<FocusBean> enList2BeanList(List<FocusEntity> entityList) {
        if (entityList == null) return null;
        List<FocusBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }


}
