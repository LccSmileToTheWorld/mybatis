package org.study.mapper;

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

    int add(Emp emp);
}
