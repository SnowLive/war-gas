package org.decade.gas.entity.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Class For:
 * 角色
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BFRoleEntity {
    private int id;
    private String roleId;/*role 事务id*/
    private String name;
    private String info;
    private int state;
    private List<PrivilegeEntity> pri;/*权限名列表*/
    private String updateTime;
    private String createTime;

}
