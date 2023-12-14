package com.blc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

public class ShutdownHook implements Runnable, BeanFactoryAware {

	BeanFactory beanFactory;
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory=beanFactory;
	}

	@Override
	public void run() {
		System.out.print("jvm going to die>>>>");
		((ConfigurableBeanFactory)beanFactory).destroySingletons();
	}

}
