package com.inw.config;

import com.inw.interceptor.MaintainanceWindowInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.inw.interceptor"})
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private MaintainanceWindowInterceptor maintainanceWindowInterceptor;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.htm").setViewName("login");
        registry.addViewController("/neworder.htm").setViewName("new-order");
        registry.addViewController("/trackorder.htm").setViewName("order-status");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/jsp/",".jsp");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(maintainanceWindowInterceptor)
                .addPathPatterns("/login.htm","/neworder.htm");
    }
}
