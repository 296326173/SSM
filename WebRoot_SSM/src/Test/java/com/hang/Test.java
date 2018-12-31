package com.hang;

import com.hang.mapper.GirlMapper;
import com.hang.pojo.Girl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 13:23 2018/12/31 23
 */
public class Test {
    @org.junit.Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Girl girl = (Girl) applicationContext.getBean("girl");
        girl.Hello();
    }
    @org.junit.Test
    public void testSpringMvc(){
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
}
