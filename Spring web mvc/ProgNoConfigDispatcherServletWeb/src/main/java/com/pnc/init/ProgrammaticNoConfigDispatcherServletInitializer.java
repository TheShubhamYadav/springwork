package com.pnc.init;

import com.pnc.config.RootConfig;
import com.pnc.config.WebMvcConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ProgrammaticNoConfigDispatcherServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootApplicationContext = null;
        AnnotationConfigWebApplicationContext servletApplicationContext = null;
        DispatcherServlet dispatcherServlet = null;
        ContextLoaderListener contextLoaderListener = null;

        rootApplicationContext = new AnnotationConfigWebApplicationContext();
        rootApplicationContext.register(RootConfig.class);
        contextLoaderListener = new ContextLoaderListener(rootApplicationContext);
        servletContext.addListener(contextLoaderListener);

        servletApplicationContext = new AnnotationConfigWebApplicationContext();
        servletApplicationContext.register(WebMvcConfig.class);
        dispatcherServlet = new DispatcherServlet(servletApplicationContext);
        ServletRegistration.Dynamic dynamic =  servletContext.addServlet("dispatcher",dispatcherServlet);
        dynamic.setLoadOnStartup(1);
        dynamic.addMapping("*.htm");
    }
}
