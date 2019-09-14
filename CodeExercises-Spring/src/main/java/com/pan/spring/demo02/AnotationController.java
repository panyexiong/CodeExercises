package com.pan.spring.demo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author panyexiong
 * @date 2019/9/14 - 23:39
 */
@Controller
public class AnotationController {

    @RequestMapping(value = "/test2")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("AnotationController Run====");
        return null;
    }

}
