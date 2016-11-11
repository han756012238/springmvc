/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  DepartmentDao.java
 * Author: qiezi
 * Date: 2016/11/11 15:25
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.dao;

import com.qiezi.springmvc.model.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * User: qiezi
 * Date: 2016/11/11
 * Time: 15:25
 */
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer, Department>();
        departments.put(101, new Department(101, "D-AA"));
        departments.put(102, new Department(102, "D-BB"));
        departments.put(103, new Department(103, "D-CC"));
        departments.put(104, new Department(104, "D-DD"));
        departments.put(105, new Department(105, "D-EE"));
    }

    public Collection<Department> getDepartments() {
        return departments.values();
    }

    public Department getDepartment(Integer id) {
        return departments.get(id);
    }
}
