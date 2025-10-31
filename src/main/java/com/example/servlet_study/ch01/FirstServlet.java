package com.example.servlet_study.ch01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("초기화");
        config.getServletContext().setAttribute("age",32);
    }

    @Override
    public void destroy() {
        System.out.println("소멸");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(" 서비스 요청 들어옴");
    }

    public FirstServlet() {
        System.out.println("FirstServlet constructor");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { req.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        System.out.println("요청들어옴");
        resp.setContentType("text/plain; charset=UTF-8");
        resp.getWriter().println("서블릿 요청 성공!");
    }
}
