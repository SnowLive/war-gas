package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  办事指南
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuidesEntity {
    private int id;
    private String guideId;     /*事务id*/
    private String powerId;     /*行政职权id todo 转为行政职权*/
    private String title;       /*标题id*/
    private String content;     /*内容*/
    private String publishTime; /*发布时间*/
    private int state;          /*状态*/
    private String updateTime;  /*更新时间*/
    private String createTime;  /*创建时间*/
}
