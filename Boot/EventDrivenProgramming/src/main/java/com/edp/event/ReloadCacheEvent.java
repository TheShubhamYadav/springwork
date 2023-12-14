package com.edp.event;

import org.springframework.context.ApplicationEvent;

public class ReloadCacheEvent extends ApplicationEvent {
    
    private String key;

    public String getKey() {
        return key;
    }

    public ReloadCacheEvent(Object source, String key) {
        super(source);
        this.key=key;
    }


}
