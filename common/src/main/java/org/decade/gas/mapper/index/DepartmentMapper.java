package org.decade.gas.mapper.index;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.index.DepartmentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * news mapper
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Repository
public interface DepartmentMapper {

    List<DepartmentEntity> listAll();

    List<DepartmentEntity> search(DepartmentEntity entity);

    List<DepartmentEntity> searchList(@Param("from") int from, @Param("to") int to);

    int totalCount();

    int insert(DepartmentEntity entity);

}
