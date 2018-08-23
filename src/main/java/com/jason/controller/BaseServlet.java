package com.jason.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {

    public String co;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("act");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        if(action!=null){
            try {
                //在當前Servlet實例中根據action找到方法訊息
                Method method = getClass().getDeclaredMethod(action,HttpServletRequest.class, HttpServletResponse.class);
                if(method!=null){
                    try {
                        // 在當前實例上調用方法method，指定參數request,response
                        method.invoke(this,req,resp);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }else {
                    try {
                        resp.getWriter().write("沒有此動作");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (NoSuchMethodException e) {
                resp.getWriter().write("調用發生錯誤"+e.getMessage());
                e.printStackTrace();
            }
        }else {
            try {
                resp.getWriter().write("沒有動作");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //super.service(req, resp);
    }
}
