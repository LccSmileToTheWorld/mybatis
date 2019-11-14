package config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.study.entity.Emp;
import org.study.utils.SqlSessionUtil;

import java.io.IOException;

/**
 * @ClassName: Config
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/13
 * @Version 1.0
 */
public class Config {

    private static String resource = "mybatis-config.xml";

    @Test
    public void test() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Emp emp = sqlSession.selectOne("org.study.mapper.EmpMapper.getEmpById", 1);
            System.out.println(emp);
        } finally {
            sqlSession.close();
        }
    }
}
