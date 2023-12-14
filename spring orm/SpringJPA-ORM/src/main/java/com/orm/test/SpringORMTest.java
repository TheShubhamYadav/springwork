package com.orm.test;

import com.orm.config.RootConfig;
import com.orm.entities.Project;
import com.orm.service.ProjectService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class SpringORMTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
        Project project = new Project();
        project.setProjectName("springboot");
        project.setTenure(12);
        project.setStartDate(LocalDate.now());
        project.setTeamSize(5);

        ProjectService projectService = applicationContext.getBean(ProjectService.class);

        //int projNo = projectService.newProject(project);
        //System.out.println("project has been created with project No: "+projNo);

        Project updateProj =(Project) projectService.updateProjectTeamSize(1,8);
        System.out.println(updateProj.toString());


    }
}
