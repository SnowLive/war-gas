package org.decade.gas.mapper.index;

import org.decade.gas.entity.index.PoliciesEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class For:
 * 政策法规
 *
 * @auther: decade
 * @date: 18-1-1
 */
@Repository
public interface PoliciesMapper {

    List<PoliciesEntity> listAll();
    int insert();
}
