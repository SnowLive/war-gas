package org.decade.gas.entity.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 后台管理员
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private int id;
    private String userId;
    private String name;
    private String passwd;
    private BFRoleEntity role;//角色id todo 转化为角色
    private int state;
    private String updateTime;
    private String createTime;

}
