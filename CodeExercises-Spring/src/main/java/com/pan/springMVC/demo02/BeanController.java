package com.pan.springMVC.demo02;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 21:36
 */
public class BeanController implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("BeanController Run====");
        return null;
    }
}
