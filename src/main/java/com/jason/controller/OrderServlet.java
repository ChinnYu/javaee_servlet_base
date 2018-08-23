package com.jason.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/OrderServlet")
public class OrderServlet extends BaseServlet {
    public void add(HttpServletRequest req, HttpServletResponse resp){
        try {
            resp.getWriter().write("執行添加訂單");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void del(HttpServletRequest req, HttpServletResponse resp){
        try {
            resp.getWriter().write("執行添加刪除訂單");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
