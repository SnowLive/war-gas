package org.decade.gas.bean.db.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.decade.gas.bean.json.NewsInfo;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsBean {
    private String newsId;
    private String title;   /*标题*/
    private String content; /*内容*/
    private String picture; /*展示图片*/
    private NewsInfo info;    /*备注信息*/
    private int state;      /*状态*/
    private String publishTime;/*发布时间*/
}
