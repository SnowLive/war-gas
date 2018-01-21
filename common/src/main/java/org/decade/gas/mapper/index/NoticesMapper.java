package org.decade.gas.mapper.index;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.index.NoticesEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 公告
 *
 * @auther: decade
 * @date: 17-12-31
 */
@Repository
public interface NoticesMapper {

    List<NoticesEntity> listAll();

    int insert(NoticesEntity entity);

    List<NoticesEntity> search(NoticesEntity entity);

    List<NoticesEntity> searchList(@Param("from") int from, @Param("to") int to);

    int totalCount();
}
