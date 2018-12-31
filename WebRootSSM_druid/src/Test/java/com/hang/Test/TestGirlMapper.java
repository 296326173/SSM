package com.hang.Test;

import com.hang.mapper.GirlMapper;
import com.hang.pojo.Girl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 17:03 2018/12/30 03
 */
public class TestGirlMapper {
    /**
     * @Description:测试mybatis
     * @auther: 陈书航
     * @date: 17:23 2018/12/30
     */
    @Test
    public void testMybatis(){
        String resource = "mybatis-config.xml";
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
            Girl girl = mapper.queryById(1);
            System.out.println(girl);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @Description:测试spring
     * @auther: 陈书航
     * @date: 17:23 2018/12/30
     */
    @Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        Girl girl = (Girl) applicationContext.getBean("girl");
        girl.hello();
    }
    @Test
    public void testSSM(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");

        SqlSession sqlSession = sqlSessionFactory.openSession();

        GirlMapper girlMapper = sqlSession.getMapper(GirlMapper.class);
        Girl girl = girlMapper.queryById(1);
        System.out.println("gekki"+girl);
    }
}
