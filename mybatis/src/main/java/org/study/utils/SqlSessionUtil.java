package org.study.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: SqlSessionUtil
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/12
 * @Version 1.0
 */
public class SqlSessionUtil {

    public static String PATH = "mybatis-config.xml";

    public static SqlSessionFactory getSqlSessionFactory(String resource) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        return builder.build(inputStream);
    }
}
