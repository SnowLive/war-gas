package org.decade.gas.mapper.index;

import org.apache.ibatis.annotations.Param;
import org.decade.gas.entity.index.QuestionsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 常见问题 mapper
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Repository
public interface QuestionsMapper {

    List<QuestionsEntity> listAll();

    List<QuestionsEntity> search(QuestionsEntity entity);

    List<QuestionsEntity> searchList(@Param("from") int from, @Param("to") int to);

    int totalCount();

}
