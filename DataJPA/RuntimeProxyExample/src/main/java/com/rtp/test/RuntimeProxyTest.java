package com.rtp.test;

import com.rtp.handler.CacheInvocationHandler;
import com.rtp.service.NetBankingService;
import com.rtp.service.NetBankingServiceImpl;

import java.lang.reflect.Proxy;

public class RuntimeProxyTest {

    public static void main(String[] args) {
        NetBankingService netBankingService = new NetBankingServiceImpl();
        CacheInvocationHandler cacheInvocationHandler = new CacheInvocationHandler(netBankingService);
        NetBankingService proxy = (NetBankingService) Proxy.newProxyInstance(netBankingService.getClass().getClassLoader(),
                new Class[]{NetBankingService.class},cacheInvocationHandler);
        System.out.println("1st req : "+proxy.getBalance("ac1235"));
        System.out.println("2nd req : "+proxy.getBalance("ac1235  "));
    }
}
