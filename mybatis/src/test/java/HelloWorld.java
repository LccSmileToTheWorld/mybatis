import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.study.entity.Emp;
import org.study.mapper.EmpMapper;
import org.study.utils.SqlSessionUtil;

import java.io.IOException;
import java.io.InputStream;


/**
 * @ClassName: HelloWorld
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/12
 * @Version 1.0
 */
public class HelloWorld {

    private static String resource = "mybatis-config.xml";

    @Test
    public void test() throws IOException {
        //1、构建SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //1.1、通过xml
        InputStream inputStream =  Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //1.2、直接配置Configuration对象
        //Configuration configuration = new Configuration();
        //SqlSessionFactory sqlSessionFactory = builder.build(configuration);

        //2、获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            //3、调用查询方法
            //3.1、调用SqlSession封装方法
            //Emp emp = sqlSession.selectOne("org.study.mapper.EmpMapper.getEmpById", 1);
            //3.2、通过SqlSession获取mapper接口代理对象，调用mapper接口中的方法
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            Emp emp = mapper.getEmpById(1);
            System.out.println(emp);
        }finally {
            //4、关闭SqlSession
            sqlSession.close();
        }

    }
}
