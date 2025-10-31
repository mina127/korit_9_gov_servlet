package com.example.servlet_study;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //content type -> 서버에 요청 또는 응답 데이터 형식을 선택

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8"); //문자열 인코딩
        // Hello
        //PrintWriter out2 = new PrintWriter(response.getOutputStream());
        PrintWriter out = response.getWriter();
        out.println("""
                {
                    "name : songmina",
                    "age : 23",
           
                }
                """
    );
    }

    public void destroy() {
    }
}