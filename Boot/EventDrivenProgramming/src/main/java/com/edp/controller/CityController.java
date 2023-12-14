package com.edp.controller;

import com.edp.event.ReloadCacheEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class CityController implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public int addCity(String cityName){
        int cityNo = new SecureRandom().nextInt(100);
        System.out.println("add city into database");
        ReloadCacheEvent event = new ReloadCacheEvent(this,"cities");
        applicationEventPublisher.publishEvent(event);
        return cityNo;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
}
