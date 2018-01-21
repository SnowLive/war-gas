package org.decade.gas.mapper.index;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.index.GuidesEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 指南 mapper
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Repository
public interface GuidesMapper {

    List<GuidesEntity> listAll();

    List<GuidesEntity> search(GuidesEntity entity);

    List<GuidesEntity> searchList(@Param("from") int from, @Param("to") int to);

    int totalCount();

}
