package com.wci.init;

import com.wci.config.RootConfig;
import com.wci.config.WebMvcConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootApplicationContext = null;
        AnnotationConfigWebApplicationContext mvcApplicationContext = null;
        ContextLoaderListener contextLoaderListener = null;
        DispatcherServlet dispatcherServlet = null;

        rootApplicationContext = new AnnotationConfigWebApplicationContext();
        rootApplicationContext.register(RootConfig.class);
        contextLoaderListener  = new ContextLoaderListener(rootApplicationContext);
        servletContext.addListener(contextLoaderListener);

        mvcApplicationContext = new AnnotationConfigWebApplicationContext();
        mvcApplicationContext.register(WebMvcConfig.class);
        dispatcherServlet = new DispatcherServlet(mvcApplicationContext);
        ServletRegistration.Dynamic dyanmic = servletContext.addServlet("dispatcher",dispatcherServlet);
        dyanmic.setLoadOnStartup(1);
        dyanmic.addMapping("*.htm");

    }
}
