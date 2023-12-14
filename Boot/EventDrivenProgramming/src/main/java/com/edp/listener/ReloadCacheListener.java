package com.edp.listener;

import com.edp.event.ReloadCacheEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReloadCacheListener //implements ApplicationListener<ReloadCacheEvent>
{
    /*
    either implement ApplicationListener<> & override onApplicationEvent()
    */
    //@Override
//    public void onApplicationEvent(ReloadCacheEvent event) {
//        System.out.println("load the data into cache for key "+event.getKey());
//    }

    /*
    (or)
    use @EventListener so we can write multiple listener in one class & methodname or listener method name also can
    be anything according us.
     */
    @EventListener
    public void reloadingCache(ReloadCacheEvent event) {
        System.out.println("load the data into cache for key "+event.getKey());
    }

}
