package com.httpServerTest.httpServer.filter;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("필터 생성됨");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("========= FirstFilter 시작 ==========");
        chain.doFilter(request,response);
        System.out.println("========= FirstFilter 종료 ==========");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter 사라짐");
        Filter.super.destroy();
    }
}
