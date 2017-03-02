/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  TestController.java
 * Author: qiezi
 * Date: 2016/12/17 14:45
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.qiezi.springmvc.model.AuthorizerInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * User: qiezi
 * Date: 2016/12/17
 * Time: 14:45
 * Description:
 */
public class TestController {

    public static void main(String[] args) {
//        String url ="http://api.l.whereask.com/dev_193/page/webpageindex.html?t=1481950234797&uid=147d21ebb8a84492986b152d869b67c3&v=1&client=1&nickname=茄子丶茄子&token=70D2C0552F734D80E666014AE5BACEF25E0817906F1926A46BCE3442141FCD9D&qr_code=1&l=1&seat_code=A1&entity_id=99001331&shop_name=薯条内网测试";
//        Map<String, String> map = urlSplit(url);
//        System.out.println(map.get("uid"));
//        List<User> list = new ArrayList<User>();
//        System.out.println(list);
        String str = "\n" +
                "{\n" +
                "        \"nick_name\": \"å°\u008Fè\u0083\u0096er\",\n" +
                "        \"head_img\": \"http://wx.qlogo.cn/mmopen/XzhF92tBcewuEU4o5uOCt0guCKbzCXkzCLkmquumTBnxO6JeRaKhhbdSib1MgcZVicvsicnZicGfzdTaAKq9lgzKarFiaN68KtgVd/0\"}";
        AuthorizerInfo authorizerInfo = JSON.parseObject(str, AuthorizerInfo.class);
        String name = authorizerInfo.getNickName();
        System.out.println(authorizerInfo.toString());

    }

    /**
     * 解析出url参数中的键值对
     * 如 "index.jsp?Action=del&id=123"，解析出Action:del,id:123存入map中
     *
     * @param URL url地址
     * @return url请求参数部分
     * @author lzf
     */
    public static Map<String, String> urlSplit(String URL) {
        Map<String, String> mapRequest = new HashMap<String, String>();
        String[] arrSplit = null;
        String strUrlParam = TruncateUrlPage(URL);
        if (strUrlParam == null) {
            return mapRequest;
        }
        arrSplit = strUrlParam.split("[&]");
        for (String strSplit : arrSplit) {
            String[] arrSplitEqual = null;
            arrSplitEqual = strSplit.split("[=]");
            //解析出键值
            if (arrSplitEqual.length > 1) {
                //正确解析
                mapRequest.put(arrSplitEqual[0], arrSplitEqual[1]);
            } else {
                if (arrSplitEqual[0] != "") {
                    //只有参数没有值，不加入
                    mapRequest.put(arrSplitEqual[0], "");
                }
            }
        }
        return mapRequest;
    }

    /**
     * 去掉url中的路径，留下请求参数部分
     *
     * @param strURL url地址
     * @return url请求参数部分
     * @author lzf
     */
    private static String TruncateUrlPage(String strURL) {
        String strAllParam = null;
        String[] arrSplit = null;
        strURL = strURL.trim().toLowerCase();
        arrSplit = strURL.split("[?]");
        if (strURL.length() > 1) {
            if (arrSplit.length > 1) {
                for (int i = 1; i < arrSplit.length; i++) {
                    strAllParam = arrSplit[i];
                }
            }
        }
        return strAllParam;
    }
}
