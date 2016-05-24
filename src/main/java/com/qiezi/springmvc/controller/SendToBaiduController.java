/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  SendToBaiduController.java
 * Author: qiezi
 * Date: 2016/5/24 17:22
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: qiezi
 * Date: 2016/5/24
 * Time: 17:22
 */
@Controller
@RequestMapping("/sendBaidu")
public class SendToBaiduController {

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String index() {
        System.out.println("½øÀ´ÁË");
        return "index";
    }
}
