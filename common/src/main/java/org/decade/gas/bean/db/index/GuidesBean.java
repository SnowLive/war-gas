package org.decade.gas.bean.db.index;

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
public class GuidesBean {
    private String guideId;     /*事务id*/
    private String powerId;     /*行政职权id */
    private String title;       /*标题id*/
    private String content;     /*内容*/
    private String publishTime; /*发布时间*/
}
