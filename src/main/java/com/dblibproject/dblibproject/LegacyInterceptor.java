package com.dblibproject.dblibproject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (request.getRequestURI().startsWith("/legacy")) {
            response.setStatus(HttpServletResponse.SC_GONE);
            return false;
        }
        return true;
    }
}
