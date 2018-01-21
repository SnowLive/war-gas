package org.decade.gas.convert;

import org.decade.gas.bean.db.index.QuestionsBean;
import org.decade.gas.entity.index.QuestionsEntity;
import org.decade.gas.utils.ConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
public class QuestionsConvert {

    public static QuestionsBean entity2Bean(QuestionsEntity entity) {
        if (entity == null) return null;
        return ConvertUtils.model2Bean(entity, QuestionsBean.class);
    }

    public static List<QuestionsBean> enList2BeanList(List<QuestionsEntity> entityList) {
        if (entityList == null) return null;
        List<QuestionsBean> beanList = new ArrayList<>();
        entityList.forEach(en -> beanList.add(entity2Bean(en)));
        return beanList;
    }

}

