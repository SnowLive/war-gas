package org.decade.gas.mapper.index;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.index.PowersEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 行政职权 mapper
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Repository
public interface PowersMapper {

    List<PowersEntity> listAll();

    List<PowersEntity> search(PowersEntity entity);

    List<PowersEntity> searchList(@Param("from") int from, @Param("to") int to);

    int totalCount();

}
