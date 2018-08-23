package com.jason;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(value = "/Hello",loadOnStartup = 1,initParams = {
        @WebInitParam(name="size",value = "100"),
        @WebInitParam(name = "color",value = "red")
})
public class Hello extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
    static {
        System.out.println("靜態代碼塊");
    }
    public Hello() {
        super();
        System.out.println("構造方法Hello()");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始方法init(),"+ config.getInitParameter("color"));
    }
    //響應請求
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----響應請求service方法-----");
        super.service(req, resp);
    }
    //響應請求doget方法
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("響應請求doget方法");
        response.getWriter().append("Served at").append(request.getContextPath());
    }

    @Override
    public void destroy() {
        System.out.println("Servlet銷毀方法destroy()");
        super.destroy();
    }

    //析構方法finalize,當對象被回收時,GC
    @Override
    protected void finalize() throws Throwable {
        System.out.println("析構方法finalize()");
    }
}
