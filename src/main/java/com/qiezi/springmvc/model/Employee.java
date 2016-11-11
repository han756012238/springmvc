/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  Employee.java
 * Author: qiezi
 * Date: 2016/11/11 14:35
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * User: qiezi
 * Date: 2016/11/11
 * Time: 14:35
 */
public class Employee {

    private Integer id;
    @NotNull
    private String lastName;
    private String email;
    private Integer gender;
    private Department department;
    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    @NumberFormat(pattern = "#,###,###.#")
    private Float salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                '}';
    }

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
    }

    public Employee() {

    }
}
