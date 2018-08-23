package com.jason.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet("/UserController")
public class UserController extends BaseServlet {


    //執行添加
    public void add(HttpServletRequest req, HttpServletResponse resp){
        try {
            resp.getWriter().write("執行添加");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //執行刪除
    public void delete(HttpServletRequest req, HttpServletResponse resp){
        try {
            resp.getWriter().write("執行刪除");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //執行修改
    public void edit(HttpServletRequest req, HttpServletResponse resp){
        try {
            resp.getWriter().write("執行修改");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

