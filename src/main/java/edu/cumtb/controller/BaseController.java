package edu.cumtb.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
public class BaseController {
    HttpServletRequest request;
    private HttpServletResponse response;
    HttpSession session;
    private ServletContext application;

    @ModelAttribute
    private void set(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
        session = request.getSession();
        application = request.getServletContext();
    }
}
