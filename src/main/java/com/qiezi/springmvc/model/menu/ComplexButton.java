/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  ComplexButton.java
 * Author: qiezi
 * Date: 2016/11/21 15:31
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
 * Time: 15:31
 * Description:父菜单项:包含有二级菜单项的一级菜单。这类菜单项包含有二个属性：name和sub_button，而sub_button以是一个子菜单项数组
 */
@Getter
@Setter
public class ComplexButton extends Button {

    private Button[] sub_button;
}
