package com.hang.mapper;

import com.hang.pojo.Girl;
import org.springframework.stereotype.Repository;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * @author: 陈书航
 * @Description:这里填写Sql语句的定义
 * @Date: 16:33 2018/12/30 33
 */
@Repository
public interface GirlMapper {
    Girl queryById(long id);
}
