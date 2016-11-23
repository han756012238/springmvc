/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  AccessToken.java
 * Author: qiezi
 * Date: 2016/11/21 15:37
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
 * Time: 15:37
 * Description:
 */
@Getter
@Setter
public class AccessToken {
    // 获取到的凭证
    private String token;
    // 凭证有效时间，单位：秒
    private int expiresIn;
}
