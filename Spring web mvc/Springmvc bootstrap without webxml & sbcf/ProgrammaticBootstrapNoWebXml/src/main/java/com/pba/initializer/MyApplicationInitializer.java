package com.pba.initializer;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        XmlWebApplicationContext rootApplicationContext = null;
        XmlWebApplicationContext servletApplicationContext = null;

        DispatcherServlet dispatcherServlet = null;
        ContextLoaderListener contextLoaderListener = null;

        rootApplicationContext = new XmlWebApplicationContext();
        rootApplicationContext.setConfigLocation("/WEB-INF/application-context.xml");
        contextLoaderListener = new ContextLoaderListener(rootApplicationContext);
        servletContext.addListener(contextLoaderListener);

        servletApplicationContext = new XmlWebApplicationContext();
        servletApplicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
        dispatcherServlet = new DispatcherServlet(servletApplicationContext);
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher",dispatcherServlet);
        dynamic.addMapping("*.htm");
        dynamic.setLoadOnStartup(1);

    }
}
