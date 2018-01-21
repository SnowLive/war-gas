package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  热点访谈
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FocusEntity {
    private int id;
    private String focusId; /*事务id*/
    private String title;   /*标题*/
    private String content; /*内容*/
    private String picture; /*图片*/
    private String info;    /*备注信息*/
    private String publishTime; /*发布时间*/
    private int state;      /*状态id*/
    private String updateTime;  /*更新时间*/
    private String createTime;  /*创建时间*/
}
