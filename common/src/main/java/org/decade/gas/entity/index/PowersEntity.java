package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PowersEntity {
    private int id;
    private String powerId;     /*事务id*/
    private String departmentId;/*todo 部门id转换为部门*/
    private String title;       /*标题*/
    private String content;     /*详解*/
    private String publishTime; /*发布时间*/
    private int state;
    private String updateTime;
    private String createTime;
}
