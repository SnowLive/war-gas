package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  公告
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoticesEntity {
    private int id;
    private String noticeId;
    private String title;   /*公告标题*/
    private String content; /*公告内容*/
    private String info;    /*备注*/
    private int state;
    private String publishTime;/*发布时间*/
    private String updateTime;
    private String createTime;

}
