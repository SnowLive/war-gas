package org.decade.gas.entity.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Class For:
 * 权限划分
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivilegeEntity {
    private int id;
    private String privilegeId;/*权限事务id*/
    private String name;    /*权限名称*/
    private String resume;  /*权限简介*/
    private List<BFRoleEntity> roles;/*角色集合*/
    private int state;
    private String updateTime;
    private String createTime;


}
