package com.pan.springMVC.demo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author panyexiong
 * @date 2019/9/14 - 23:39
 */
@Controller
@RequestMapping(value = "/test")
public class AnotationController {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println(httpServletRequest.getHeaderNames());
        System.out.println("AnotationController Run====");
        return "success";
    }

}
