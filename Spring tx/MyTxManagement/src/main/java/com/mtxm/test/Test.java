package com.mtxm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtxm.controller.NewPlayerController;
import com.mtxm.form.TeamSelectionForm;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/mtxm/common/application-context.xml");
		
		TeamSelectionForm form = new TeamSelectionForm();
		form.setAge(26);
		form.setEmail("shubham@gmail.com");
		form.setGender("male");
		form.setLevel("universal level");
		form.setPlayerName("Shubham");
		form.setSportType("Cricket");
		form.setTeamManagerName("Virat kohli");
		form.setTeamName("Delhi Team");
		form.setTeamType("Mens Cricket Team");
		
		NewPlayerController controller = applicationContext.getBean("newPlayerController",NewPlayerController.class);
		int playerNo = controller.newPlayer(form);
		System.out.println("player no is "+playerNo);
	}

}
