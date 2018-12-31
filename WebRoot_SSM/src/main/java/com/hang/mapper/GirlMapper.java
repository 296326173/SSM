package com.hang.mapper;

import com.hang.pojo.Girl;
import org.springframework.stereotype.Repository;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 15:17 2018/12/31 17
 */
@Repository
public interface GirlMapper {
    Girl queryById(Integer id);
}
