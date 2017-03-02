/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  AuthorizerInfo.java
 * Author: qiezi
 * Date: 2017/2/15 17:22
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.model;

/**
 * User: qiezi
 * Date: 2017/2/15
 * Time: 17:22
 * Description:
 */
public class AuthorizerInfo {
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String headImg;

    public String getNickName() {
        return nickName;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setNick_name(String nick_name) {
        this.nickName = nick_name;
    }

    public void setHead_img(String head_img) {
        this.headImg = head_img;
    }

    @Override
    public String toString() {
        return "AuthorizerInfo{" +
                "nick_name='" + nickName + '\'' +
                ", head_img='" + headImg + '\'' +
                '}';
    }
}
