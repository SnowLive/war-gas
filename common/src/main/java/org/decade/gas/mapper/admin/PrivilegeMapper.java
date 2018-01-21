package org.decade.gas.mapper.admin;

import org.decade.gas.entity.admin.PrivilegeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * privilege 权限管理
 *
 * @auther: decade
 * @date: 17-12-29
 */
@Repository
public interface PrivilegeMapper {

    //查询不含角色的权限
    PrivilegeEntity select(PrivilegeEntity entity);
    //查询所有满足条件的数据
    List<PrivilegeEntity> searchList(PrivilegeEntity entity);

    List<PrivilegeEntity> searchWithRole(PrivilegeEntity entity);

    List<PrivilegeEntity> listAll();

    int insert(PrivilegeEntity entity);


}
