package com.qiezi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.Map;

/**
 * User: qiezi
 * Date: 2016/4/7
 * Time: 17:02
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    /**
     * 返回ModelAndView
     *
     * @return
     */
    @RequestMapping("/test1")
    public ModelAndView test1() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("test1"); // 设置返回的文件名
        mav.addObject("mav", "我的返回类型是ModelAndView.");
        return mav;
    }

    /**
     * 返回Model
     *
     * @param model
     * @return
     */
    @RequestMapping("test2")
    public Model test2(Model model) {
        model.addAttribute("model", "我的返回类型是Model");
        return model;
    }

    /**
     * 返回ModelMap
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("test3")
    public ModelMap test3(ModelMap modelMap) {
        modelMap.addAttribute("modelMap", "我的返回类型是ModelMap");
        return modelMap;
    }

    /**
     * 返回Map
     *
     * @return
     */
    @RequestMapping("test4")
    public Map test4(Map map) {
        map.put("map", "我的返回类型是Map");
        return map;
    }

    /**
     * 返回View
     *
     * @return
     */
    @RequestMapping("test5")
    public View test5() {
        return null;
    }

    /**
     * 返回Void
     *
     * @param map
     */
    @RequestMapping("test6")
    public void test6(Map<String, Object> map) {
        map.put("key", "我的返回类型是Void");
    }

    /**
     * 返回String
     *
     * @param map
     * @return
     */
    @RequestMapping("test7")
    public String test7(Map<String, Object> map) {
        map.put("key", "我的返回类型是String");
        return "test7";
    }

}
