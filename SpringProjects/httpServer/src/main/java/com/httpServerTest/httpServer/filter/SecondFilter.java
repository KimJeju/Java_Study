package com.httpServerTest.httpServer.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("두번째 필터입니다.");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("======== 두번째 필터 시작입니다 ========");
        chain.doFilter(request,response);

        System.out.println("======== 두번째 필터 끝입니다 ========");
    }

    @Override
    public void destroy() {

        System.out.println("======== 두번째 필터 사라짐 ========");
        Filter.super.destroy();
    }
}
