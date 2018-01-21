package org.decade.gas.bean.db.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 热点访谈
 *
 * @auther: decade
 * @date: 18-1-2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FocusBean {
    private String focusId; /*事务id*/
    private String title;   /*标题*/
    private String content; /*内容*/
    private String picture; /*图片*/
    private String info;    /*备注信息*/
    private String publishTime; /*发布时间*/
}