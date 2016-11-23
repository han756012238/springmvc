/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  CommonButton.java
 * Author: qiezi
 * Date: 2016/11/21 15:30
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
 * Time: 15:30
 * Description:子菜单项:没有子菜单的菜单项，有可能是二级菜单项，也有可能是不含二级菜单的一级菜单。
 */
@Getter
@Setter
public class CommonButton extends Button {

    private String type;
    private String key;
}
