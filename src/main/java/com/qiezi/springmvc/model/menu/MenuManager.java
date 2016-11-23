/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  MenuManager.java
 * Author: qiezi
 * Date: 2016/11/21 15:47
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.model.menu;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: qiezi
 * Date: 2016/11/21
 * Time: 15:47
 * Description:
 */
public class MenuManager {
    private static Logger log = LoggerFactory.getLogger(MenuManager.class);

//    public static void main(String[] args) {
//        // 第三方用户唯一凭证
//        String appId = "000000000000000000";
//        // 第三方用户唯一凭证密钥
//        String appSecret = "00000000000000000000000000000000";
//
//        // 调用接口获取access_token
//        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);
//
//        if (null != at) {
//            // 调用接口创建菜单
//            int result = WeixinUtil.createMenu(getMenu(), at.getToken());
//
//            // 判断菜单创建结果
//            if (0 == result)
//                log.info("菜单创建成功！");
//            else
//                log.info("菜单创建失败，错误码：" + result);
//        }
//    }

    /**
     * 组装菜单数据
     *
     * @return
     */
    private static Menu getMenu() {
        CommonButton btn11 = new CommonButton();
        btn11.setName("天气预报");
        btn11.setType("click");
        btn11.setKey("11");

        CommonButton btn12 = new CommonButton();
        btn12.setName("公交查询");
        btn12.setType("click");
        btn12.setKey("12");

        CommonButton btn13 = new CommonButton();
        btn13.setName("周边搜索");
        btn13.setType("click");
        btn13.setKey("13");

        CommonButton btn14 = new CommonButton();
        btn14.setName("历史上的今天");
        btn14.setType("click");
        btn14.setKey("14");

        CommonButton btn21 = new CommonButton();
        btn21.setName("歌曲点播");
        btn21.setType("click");
        btn21.setKey("21");

        CommonButton btn22 = new CommonButton();
        btn22.setName("经典游戏");
        btn22.setType("click");
        btn22.setKey("22");

        CommonButton btn23 = new CommonButton();
        btn23.setName("美女电台");
        btn23.setType("click");
        btn23.setKey("23");

        CommonButton btn24 = new CommonButton();
        btn24.setName("人脸识别");
        btn24.setType("click");
        btn24.setKey("24");

        CommonButton btn25 = new CommonButton();
        btn25.setName("聊天唠嗑");
        btn25.setType("click");
        btn25.setKey("25");

        CommonButton btn31 = new CommonButton();
        btn31.setName("Q友圈");
        btn31.setType("click");
        btn31.setKey("31");

        CommonButton btn32 = new CommonButton();
        btn32.setName("电影排行榜");
        btn32.setType("click");
        btn32.setKey("32");

        CommonButton btn33 = new CommonButton();
        btn33.setName("幽默笑话");
        btn33.setType("click");
        btn33.setKey("33");

        /**
         * 微信：  mainBtn1,mainBtn2,mainBtn3底部的三个一级菜单。
         */

        ComplexButton mainBtn1 = new ComplexButton();
        mainBtn1.setName("生活助手");
        //一级下有4个子菜单
        mainBtn1.setSub_button(new CommonButton[]{btn11, btn12, btn13, btn14});


        ComplexButton mainBtn2 = new ComplexButton();
        mainBtn2.setName("休闲驿站");
        mainBtn2.setSub_button(new CommonButton[]{btn21, btn22, btn23, btn24, btn25});


        ComplexButton mainBtn3 = new ComplexButton();
        mainBtn3.setName("更多体验");
        mainBtn3.setSub_button(new CommonButton[]{btn31, btn32, btn33});

        /**
         * 封装整个菜单
         */
        Menu menu = new Menu();
        menu.setButton(new Button[]{mainBtn1, mainBtn2, mainBtn3});

        return menu;
    }


    private static Menu getMenuForWx() {
//        CommonButton wxBtn11 = new CommonButton();
//        wxBtn11.setName("点菜");
//        wxBtn11.setType("view");
//        wxBtn11.setUrl("www.baidu.com");
//
//        CommonButton wxBtn12 = new CommonButton();
//        wxBtn12.setName("结账");
//        wxBtn12.setType("view");
//        wxBtn12.setUrl("www.baidu.com");
//
//        ComplexButton wxBtn1 = new ComplexButton();
//        wxBtn1.setName("点菜/结账");
//        wxBtn1.setSub_button(new CommonButton[]{wxBtn11, wxBtn12});
//
//        CommonButton wxBtn2 = new CommonButton();
//        wxBtn2.setName("附近的店");
//        wxBtn2.setType("view");
//        wxBtn2.setUrl("www.google.co.jp");
//
//        CommonButton wxBtn31 = new CommonButton();
//        wxBtn31.setName("我的会员卡");
//        wxBtn31.setType("view");
//        wxBtn31.setUrl("www.bing.com");
//
//        CommonButton wxBtn32 = new CommonButton();
//        wxBtn32.setName("我的优惠券");
//        wxBtn32.setType("view");
//        wxBtn32.setUrl("www.sogou.com");
//
//        CommonButton wxBtn33 = new CommonButton();
//        wxBtn33.setName("火小二下载");
//        wxBtn33.setType("view");
//        wxBtn33.setUrl("http://www.2dfire.com/cardcase/index.html");
//
//        CommonButton wxBtn34 = new CommonButton();
//        wxBtn34.setName("排队进度");
//        wxBtn34.setType("click");
//        wxBtn34.setKey("KEY_TOP_QUEUE");
//
//        CommonButton wxBtn35 = new CommonButton();
//        wxBtn35.setName("我的道具");
//        wxBtn35.setType("view");
//        wxBtn35.setUrl("http://www.qq.com/");
//
//        ComplexButton wxBtn3 = new ComplexButton();
//        wxBtn3.setName("更多");
//        wxBtn3.setSub_button(new CommonButton[]{wxBtn31, wxBtn32, wxBtn33, wxBtn34, wxBtn35});
//
//        Menu menu = new Menu();
//        menu.setButton(new Button[]{wxBtn1, wxBtn2, wxBtn3});
//        return menu;
        CommonButton wxBtn11 = new CommonButton();
        wxBtn11.setName("点菜");
        wxBtn11.setType("view");
        wxBtn11.setUrl("www.baidu.com");

        CommonButton wxBtn12 = new CommonButton();
        wxBtn12.setName("结账");
        wxBtn12.setType("view");
        wxBtn12.setUrl("www.baidu.com");

        ComplexButton wxBtn1 = new ComplexButton();
        wxBtn1.setName("点菜/结账");
        wxBtn1.setSub_button(new CommonButton[]{wxBtn11, wxBtn12});

        CommonButton wxBtn2 = new CommonButton();
        wxBtn2.setName("附近的店");
        wxBtn2.setType("view");
        wxBtn2.setUrl("www.baidu.com");

        CommonButton wxBtn33 = new CommonButton();
        wxBtn33.setName("火小二下载");
        wxBtn33.setType("view");
        wxBtn33.setUrl("http://www.2dfire.com/cardcase/index.html");

        CommonButton wxBtn34 = new CommonButton();
        wxBtn34.setName("排队进度");
        wxBtn34.setType("click");
        wxBtn34.setKey("KEY_TOP_QUEUE");

        CommonButton wxBtn35 = new CommonButton();
        wxBtn35.setName("我的道具");
        wxBtn35.setType("view");
        wxBtn35.setUrl("www.baidu.com");

        ComplexButton wxBtn3 = new ComplexButton();
        wxBtn3.setName("更多");
        wxBtn3.setSub_button(new CommonButton[]{wxBtn33, wxBtn34, wxBtn35});

        Menu menu = new Menu();
        menu.setButton(new Button[]{wxBtn1, wxBtn2, wxBtn3});
        return menu;
    }

    public static void main(String[] args) {
        Menu menu = getMenuForWx();
        String jsonMenu = JSONObject.toJSONString(menu).toString();
        System.out.println(jsonMenu);
    }
}
