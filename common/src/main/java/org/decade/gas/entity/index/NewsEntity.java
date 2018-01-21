package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 新闻
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsEntity {
    private int id;
    private String newsId;
    private String title;   /*标题*/
    private String content; /*内容*/
    private String picture; /*展示图片*/
    private String info;    /*备注信息*/
    private int state;      /*状态*/
    private String publishTime;/*发布时间*/
    private String updateTime;
    private String createTime;

}
