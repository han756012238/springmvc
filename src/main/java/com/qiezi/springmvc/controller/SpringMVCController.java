/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  SpringMVCController.java
 * Author: qiezi
 * Date: 2016/11/11 10:44
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.controller;

import com.qiezi.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * User: qiezi
 * Date: 2016/11/11
 * Time: 10:44
 */
@Controller
@RequestMapping("/springmvc")
public class SpringMVCController {

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return "success";
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value="id") Integer id){
        System.out.println("testPathVariable:" + id);
        return "success";
    }

    @RequestMapping(value="/testRequestParam")
    public String testRequestParam(@RequestParam(value="username") String username, @RequestParam(value="age", required=false, defaultValue="0") int age){
        System.out.println("testRequestParam" + " username:" + username + " age:" +age);
        return "success";
    }

    @RequestMapping(value="/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String cookieValue){
        System.out.println("testCookieValue: " + cookieValue);
        return "success";
    }

    @RequestMapping(value="/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept-Language") String language){
        System.out.println("testRequestHeader Accept-Languge:" + language);
        return "success";
    }

    @RequestMapping(value="/testRest/{id}", method= RequestMethod.PUT)
    public String testRestPut(@PathVariable(value="id") Integer id){
        System.out.println("test put:" + id);
        return "success";
    }

    @RequestMapping(value="/testRest/{id}", method=RequestMethod.DELETE)
    public String testRestDelete(@PathVariable(value="id") Integer id){
        System.out.println("test delete:" + id);
        return "success";
    }

    @RequestMapping(value="/testRest", method=RequestMethod.POST)
    public String testRest(){
        System.out.println("test post");
        return "success";
    }

    @RequestMapping(value="/testRest/{id}", method=RequestMethod.GET)
    public String testRest(@PathVariable(value="id") Integer id){
        System.out.println("test get:" + id);
        return "success";
    }

    @RequestMapping(value="/testPojo")
    public String testPojo(User user){
        System.out.println("testPojo: " + user);
        return "success";
    }

    @RequestMapping(value="/testModelAndView")
    public ModelAndView testModelAndView(){
        String viewName = "success";
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time", new Date());
        return modelAndView;
    }

    @RequestMapping("/testViewAndViewResolver")
    public String testViewAndViewResolver(){
        System.out.println("testViewAndViewResolver");
        return "success";
    }



}
