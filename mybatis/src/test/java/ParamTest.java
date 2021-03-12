import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.study.entity.Emp;
import org.study.mapper.EmpMapper;
import org.study.utils.SqlSessionUtil;

/**
 * <p></p>
 *
 * @version 1.0
 * @author: Lcc
 * @date: 2021/3/12
 */
public class ParamTest {

    @Test
    public void test1() throws Exception{
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory(SqlSessionUtil.PATH);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //单参数时，#{}中随便写
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp);
        //多个参数时，参数封装成了map，key:arg0...argN-1 或者 param1...paramN
        Emp emp2 = mapper.getEmpByIdName(1, "张三");
        System.out.println(emp2);
        //多个参数时，可以通过@Param指定key
        Emp emp3 = mapper.getEmpByParam(1, "张三");
        System.out.println(emp3);
    }
}
