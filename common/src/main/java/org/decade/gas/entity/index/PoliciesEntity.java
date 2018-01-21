package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  政策法规
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoliciesEntity {
    private int id;
    private String policyId;    /*事务id*/
    private String title;       /*标题*/
    private String content;     /*内容*/
    private String info;        /*信息*/
    private int state;
    private String publishTime; /*发布时间*/
    private String updateTime;
    private String createTime;
}
