package org.decade.gas.bean.db.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoticesBean {
    private String noticeId;
    private String title;   /*公告标题*/
    private String content; /*公告内容*/
    private String info;    /*备注*/
    private String publishTime;/*发布时间*/

}
