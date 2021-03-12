package org.study.mapper;

import org.apache.ibatis.annotations.Param;
import org.study.entity.Emp;

/**
 * @ClassName: EmpMapper
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/12
 * @Version 1.0
 */
public interface EmpMapper {

    Emp getEmpById(Integer id);

    Emp getEmpByIdName(Integer id, String empName);

    int add(Emp emp);

    Emp getEmpByParam(@Param("id") int id, @Param("empName") String empName);
}
