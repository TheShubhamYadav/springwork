package com.beanscope.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.beanscope.beans.Player;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/beanscope/common/application-context.xml"));
        Player player1 = beanFactory.getBean("player",Player.class);
        Player player2 = beanFactory.getBean("player",Player.class);
        System.out.println(player1==player2);
	}

}
