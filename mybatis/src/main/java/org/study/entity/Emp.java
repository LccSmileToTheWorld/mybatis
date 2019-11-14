package org.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;

/**
 * @ClassName: Emp
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/12
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Alias("emp")
public class Emp {

    private Integer id;
    private String empName;
    private BigDecimal salary;
    private Integer deptId;
}
