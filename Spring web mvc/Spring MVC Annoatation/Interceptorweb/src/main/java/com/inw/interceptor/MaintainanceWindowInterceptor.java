package com.inw.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.LocalDateTime;
import java.util.Calendar;

@Component
public class MaintainanceWindowInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        int dayHour = LocalDateTime.now().getHour();
        //int dayHour2 = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(dayHour>=22 || dayHour<=2){
            response.sendRedirect("maintanance.jsp");
            return false;
        }
        return true;

    }
}
