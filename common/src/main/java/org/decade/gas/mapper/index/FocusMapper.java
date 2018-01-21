package org.decade.gas.mapper.index;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.index.FocusEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 *  热点访谈
 * @auther: decade
 * @date: 18-1-2
 */
@Repository
public interface FocusMapper {

    List<FocusEntity> listAll();

    List<FocusEntity> search(FocusEntity entity);

    List<FocusEntity> searchList(@Param("from") int from, @Param("to") int to);

    int totalCount();
}
