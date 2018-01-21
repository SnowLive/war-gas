package org.decade.gas.mapper.index;

import org.decade.gas.entity.index.PublicEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 公众用户 mapper
 *
 * @auther: decade
 * @date: 17-12-30
 */
@Repository
public interface PublicMapper {

    List<PublicEntity> listAll();

}
