package org.decade.gas.bean.db.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoliciesBean {
    private String policyId;    /*事务id*/
    private String title;       /*标题*/
    private String content;     /*内容*/
    private String info;        /*信息*/
    private int state;
    private String publishTime; /*发布时间*/
}