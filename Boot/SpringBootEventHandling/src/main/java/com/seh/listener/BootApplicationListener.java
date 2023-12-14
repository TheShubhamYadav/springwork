package com.seh.listener;

import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

public class BootApplicationListener implements ApplicationListener<ApplicationPreparedEvent>
{
    //1. ApplicationStartingEvent
    //    after calling SpringApplication.run(Config.class, arg), before performing any activities in bringing up the application.
    //    Indicating the startup of the application, the SpringApplication class published ApplicationStartingEvent.

//    @Override
//    public void onApplicationEvent(ApplicationStartingEvent event) {
//        System.out.println("listener is executed for : "+event.getClass().getName());
//    }

    //2. ApplicationEnvironmentPreparedEvent
    //    after creating the environment object, after detecting and loading the external configuration into the env object,
    //    then SpringApplication class publishes ApplicationEnvironmentPreparedEvent by wrapping environment object inside it

//    @Override
//    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
//        System.out.println("listener is executed for : "+event.getClass().getName());
//    }

    //3. ApplicationPreparedEvent
    //    after ioc container has been created, after loading the bean definitions, before instantiating objects for
    //    the bean definitions, the SpringApplication class publishes ApplicationPreparedEvent

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("listener is executed for : "+event.getClass().getName());
    }

    //4. ApplicationStartedEvent
    //    after the ioc container has instantiated the objects for the bean definitions, before invoking the CommandLineRunners
    //    or ApplicationRunners it publishes ApplicationStartedEvent

//    @Override
//    public void onApplicationEvent(ApplicationStartedEvent event) {
//        System.out.println("listener is executed for : "+event.getClass().getName());
//    }

    //5. ApplicationReadyEvent
    //    after executing the CommandLineRunners and ApplicationRunners successfully before returning the ioc container to
    //    the application, the SpringApplication class published ApplicationReadyEvent

//    @Override
//    public void onApplicationEvent(ApplicationReadyEvent event) {
//        System.out.println("listener is executed for : "+event.getClass().getName());
//    }

    //6. ApplicationFailedEvent
    //    during any of these stages in bringing up spring boot application, it there is a failure encoutered, representing
    //    the failure the SpringApplication class published ApplicationFailedEvent and terminates the application




}
