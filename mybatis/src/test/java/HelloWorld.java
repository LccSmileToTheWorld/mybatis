import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.study.entity.Emp;
import org.study.utils.SqlSessionUtil;

import java.io.IOException;



/**
 * @ClassName: HelloWorld
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/12
 * @Version 1.0
 */
public class HelloWorld {

    private static String resource = "mybatis-config-helloworld.xml";

    @Test
    public void test() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Emp emp = sqlSession.selectOne("org.study.mapper.EmpMapper.getEmpById", 1);
            System.out.println(emp);
        }finally {
            sqlSession.close();
        }

    }
}
