package org.decade.gas.mapper.admin;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.admin.BFRoleEntity;
import org.decade.gas.entity.admin.PrivilegeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 角色管理
 * 插入,更新,罗列所有角色,
 * 为角色添加权限.
 *
 * @auther: decade
 * @date: 17-12-26
 */
@Repository
public interface BFRoleMapper {

    BFRoleEntity select(BFRoleEntity entity);

    List<BFRoleEntity> listAll();

    List<BFRoleEntity> selectWithPrivilege(BFRoleEntity entity);

    int insert(BFRoleEntity entity);

    int update(BFRoleEntity entity);

    int addPrivilege(@Param("lkId") String lkId, @Param("role") BFRoleEntity role, @Param("privilege")PrivilegeEntity privilege);

}
