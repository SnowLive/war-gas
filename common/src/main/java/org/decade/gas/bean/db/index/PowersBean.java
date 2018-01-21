package org.decade.gas.bean.db.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  行政职权
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PowersBean {
    private String powerId;     /*事务id*/
    private String departmentId;/*部门id*/
    private String title;       /*标题*/
    private String content;     /*详解*/
    private String publishTime; /*发布时间*/
}
