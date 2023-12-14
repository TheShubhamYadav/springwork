package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Launcher implements BeanFactoryAware {
	BeanFactory beanFactory = null;
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory=beanFactory;
	}
	public void launch() {
		Rocket rocket = null;
		rocket = beanFactory.getBean("rocket",Rocket.class);
		rocket.propel();
		System.out.println("Rocket is launched towards space");
	}

}
