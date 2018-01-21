package org.decade.gas.utils;

import org.decade.gas.bean.db.index.NewsBean;
import org.decade.gas.bean.json.NewsInfo;
import org.decade.gas.entity.index.NewsEntity;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class For:
 * 类型转换工具
 *
 * @auther: snowlive
 * @date: 18-1-1
 */
public class ConvertUtils {

    /**
     * * 从一个entity返回一个Bean
     * todo 有待思考
     * 多对少:
     * 遍历少的Object,依次获取,然后,分别拿到相应的数据.
     *
     * @param en  entity对象
     * @param O   bean类实例
     * @param <T> bean类泛型
     * @return bean
     */
    public static <T> T model2Bean(Object en, Class<T> O) {
        //1.创建目标对象T
        T bean = null;
        Constructor<T> T_constructurtor;
        //2.属性拖入.
        try {
            //bean 构造方法
            T_constructurtor = O.getConstructor();
            //创建Bean
            bean = T_constructurtor.newInstance();
            //entity 属性域变量
            Field enField;
            for (Field field : bean.getClass().getDeclaredFields()) {
                //获取entity 相应属性域
                enField = en.getClass().getDeclaredField(field.getName());
                //设置Bean 属性可编辑
                enField.setAccessible(true);
                field.setAccessible(true);
                if (enField.getType().equals(field.getType())) field.set(bean, enField.get(en));
                else field.set(bean, JsonSimpleUtils.str2Obj((String) enField.get(en), field.getType()));
            }
        } catch (NoSuchMethodException | IllegalAccessException |
                InvocationTargetException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        //3.返回结果.
        return bean;
    }


    @Test
    public void test() {
        String json = "{\"id\": 2, \"newsId\": \"2e8d0017d87a42d6a7e760c0034d0038\", \"title\": \"权威发布：让人民吃得放心！淄博市全面实施餐饮质量安全提升工程\", \"content\": \"<div\", \"picture\": \"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=194734624,2596212943&fm=173&s=54125D9A491543EFD9FCBD43030070B3&w=550&h=478&img.JPEG\", \"info\": \"{\\\"source\\\":\\\"网易新闻\\\",\\\"date\\\":\\\"12-30\\\",\\\"time\\\":\\\"16:42\\\"}\", \"state\": 1, \"publishTime\": \"2018-01-01 11:47:29.0\", \"updateTime\": \"2018-01-01 11:47:29.0\", \"createTime\": \"2018-01-01 11:47:29.0\"}";
        NewsEntity entity = JsonSimpleUtils.str2Obj(json, NewsEntity.class);
        NewsBean bean = model2Bean(entity, NewsBean.class);
        System.out.println(JsonSimpleUtils.obj2Str(bean));
    }


    /**
     * 替换方法为NewsConvert.entity2Bean;
     * 将传入的newentity转化为Bean
     *
     * @param entity newsentity
     * @return NewsBean
     */
    @Deprecated
    public static NewsBean news2Bean(NewsEntity entity) {
        NewsBean bean = new NewsBean();
        bean.setInfo(JsonSimpleUtils.str2Obj(entity.getInfo(), NewsInfo.class));
        bean.setTitle(entity.getTitle());
        bean.setContent(entity.getContent());
        bean.setNewsId(entity.getNewsId());
        bean.setPicture(entity.getPicture());
        bean.setPublishTime(entity.getPublishTime());
        bean.setState(entity.getState());
        return bean;
    }

    /**
     * * 替换方法为NewsConvert.enList2BeanList;
     *
     * @param entityList newsList
     * @return  beanList
     */
    @Deprecated
    public static List<NewsBean> news2ListBean(List<NewsEntity> entityList) {
        List<NewsBean> beanList = new ArrayList<>();
        for (NewsEntity entity : entityList) {
            beanList.add(news2Bean(entity));
        }
        return beanList;
    }

}
