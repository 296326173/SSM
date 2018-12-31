package com.hang.service;

import com.hang.pojo.Girl;
import org.springframework.stereotype.Repository;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 16:45 2018/12/31 45
 */
@Repository
public interface GirlService {
    Girl selectGirl() throws Exception;
}
