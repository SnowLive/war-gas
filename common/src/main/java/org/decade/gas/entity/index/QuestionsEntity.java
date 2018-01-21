package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  常见问题
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionsEntity {
    private int id;
    private String questionId;  /*事务id*/
    private String question;    /*常见问题*/
    private String answer;      /*解答*/
    private String info;        /*备注*/
    private int state;          /*状态*/
    private String updateTime;  /*更新*/
    private String createTime;  /*创建*/
}
