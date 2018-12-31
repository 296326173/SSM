package com.hang.service.serviceImpl;

import com.hang.mapper.GirlMapper;
import com.hang.pojo.Girl;
import com.hang.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 20:39 2018/12/30 39
 */
@Service
class GirlServiceImp implements GirlService {
    @Autowired
    private GirlMapper girlMapper;

    @Override
    public Girl selectGirl() throws Exception {
        return girlMapper.queryById(1);
    }
}
