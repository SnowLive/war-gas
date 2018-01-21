package org.decade.gas.bean.db.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 常见问题
 *
 * @auther: decade
 * @date: 18-1-5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionsBean {
    private String questionId;  /*事务id*/
    private String question;    /*常见问题*/
    private String answer;      /*解答*/
    private String info;        /*备注*/
    private int state;          /*状态*/
    private String updateTime;  /*更新*/
    private String createTime;  /*创建*/
}
