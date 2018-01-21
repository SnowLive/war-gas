package org.decade.gas.convert;

import org.decade.gas.bean.db.index.DepartmentBean;
import org.decade.gas.entity.index.DepartmentEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *  部门类型转化
 * @auther: decade
 * @date: 18-1-1
 */
public class DepartmentConvert {

    public static DepartmentBean entity2Bean(DepartmentEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, DepartmentBean.class);
    }

    public static List<DepartmentBean> enList2BeanList(List<DepartmentEntity> entityList) {
        if (entityList == null) return null;
        List<DepartmentBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}

