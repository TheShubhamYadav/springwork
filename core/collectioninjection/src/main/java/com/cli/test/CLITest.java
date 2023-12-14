package com.cli.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cli.beans.Game;
import com.cli.beans.Stadium;

public class CLITest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/cli/common/application-context.xml"));
		/*Game game = beanFactory.getBean("game",Game.class);
		System.out.println("game1 : \n"+game);
		Game nextGame = beanFactory.getBean("game2",Game.class);
		System.out.println("game2 : \n"+nextGame);*/
		Stadium stadium = beanFactory.getBean("stadium",Stadium.class);
		System.out.println(stadium);
	}

}
