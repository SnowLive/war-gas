package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  公职人员 涉及多对多问题.
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfficialsEntity {
    private int id;
    private String officialId;  /*事务Id*/
    private String name;        /*名字*/
    private String role;        /*角色id todo 转化为角色*/
    private String webName;     /*昵称*/
    private String passwd;      /*密码*/
    private String departmentId;/*部门id todo 转化为角色*/
    private String picture;     /*证件照*/
    private String realName;    /*真实姓名*/
    private String sex;         /*性别*/
    private String origin;      /*籍贯*/
    private String nation;      /*民族*/
    private String college;     /*毕业院校*/
    private String degree;      /*学历/学位*/
    private String joinPartyTime;/*入党时间*/
    private String joinWorkTime;/*参加工作时间*/
    private String resume;      /*简介*/
    private int state;          /*状态*/
    private String updateTime;  /*发布时间*/
    private String createTime;  /*创建时间*/
}
