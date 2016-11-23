/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  Button.java
 * Author: qiezi
 * Date: 2016/11/21 11:54
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.model.menu;

import lombok.Getter;
import lombok.Setter;

/**
 * User: qiezi
 * Date: 2016/11/21
 * Time: 11:54
 * Description:菜单项的基类
 */
@Getter
@Setter
public class Button {

    private String name;//所有一级菜单、二级菜单都共有一个相同的属性，那就是name
    private String url;
}
