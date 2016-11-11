/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  EmployeeController.java
 * Author: qiezi
 * Date: 2016/11/11 15:32
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.controller;

import com.qiezi.springmvc.dao.DepartmentDao;
import com.qiezi.springmvc.dao.EmployeeDao;
import com.qiezi.springmvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * User: qiezi
 * Date: 2016/11/11
 * Time: 15:32
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private EmployeeDao employeeDao;
    @Resource
    private DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Map<String, Object> map) {
        map.put("employees", employeeDao.getAll());
        return "employee/list";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String input(Map<String, Object> map) {
        map.put("departments", departmentDao.getDepartments());
        map.put("employee", new Employee());
        return "employee/input";
    }

    @RequestMapping(value="/emp", method=RequestMethod.POST)
    public String save(Employee employee){
        employeeDao.save(employee);
        return "redirect:emps";
    }

    @RequestMapping(value="/emp/{id}", method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:emps";
    }

    @RequestMapping(value="/emp/{id}", method=RequestMethod.GET)
    public String input(@PathVariable("id") Integer id, Map<String, Object> map){
        map.put("employee", employeeDao.get(id));
        map.put("departments", departmentDao.getDepartments());
        return "employee/input";
    }

    @ModelAttribute
    public void getEmployee(@RequestParam(value="id",required=false) Integer id, Map<String, Object> map){
        if(id != null){
            map.put("employee", employeeDao.get(id));
        }
    }

    @RequestMapping(value="/emp", method=RequestMethod.PUT)
    public String update(Employee employee){
        employeeDao.save(employee);
        return "redirect:emps";
    }
}
