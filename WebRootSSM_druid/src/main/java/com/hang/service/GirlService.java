package com.hang.service;

import com.hang.pojo.Girl;
import org.springframework.stereotype.Repository;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 20:05 2018/12/30 05
 */
@Repository
public interface GirlService {
    Girl selectGirl() throws Exception;
}
