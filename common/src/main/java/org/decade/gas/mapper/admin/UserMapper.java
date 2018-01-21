package org.decade.gas.mapper.admin;

import org.decade.gas.entity.admin.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 管理员dao
 *
 * @auther: decade
 * @date: 17-12-30
 */
@Repository
public interface UserMapper {

    List<UserEntity> listAll();

    int insert(UserEntity entity);

}
