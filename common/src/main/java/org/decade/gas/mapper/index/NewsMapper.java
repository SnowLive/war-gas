package org.decade.gas.mapper.index;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.index.NewsEntity;
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
public interface NewsMapper {

    List<NewsEntity> listAll();

    List<NewsEntity> search(NewsEntity entity);

    List<NewsEntity> searchList(@Param("from") int from, @Param("to") int to);

    int totalCount();

}
