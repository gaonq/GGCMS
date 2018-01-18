package com.gaonq.dao;

import com.gaonq.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository("employeeMapper")
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer auid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer auid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}