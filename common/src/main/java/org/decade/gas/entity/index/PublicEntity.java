package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.decade.gas.entity.admin.BFRoleEntity;

/**
 * Class For:
 * 公众用户
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicEntity {
    private int id;
    private String publicId;/*事务id*/
    private BFRoleEntity role;  /*角色*/
    private String name;    /*公众账号*/
    private String sex;     /*性别*/
    private String passwd;  /*密码*/
    private String realName;/*真实姓名*/
    private String info;    /*备注信息*/
    private String phoneNumber;/*电话号码*/
    private String picture; /*头像*/
    private int state;      /*状态*/
    private String updateTime;
    private String createTime;
}
