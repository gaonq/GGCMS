package com.gaonq.impl;

import com.gaonq.dao.EmployeeMapper;
import com.gaonq.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaonq on 2018/1/16.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee selectByPrimaryKey(Integer auid){
        return employeeMapper.selectByPrimaryKey(auid);
    }
}
