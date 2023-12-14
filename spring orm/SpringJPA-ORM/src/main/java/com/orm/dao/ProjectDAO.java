package com.orm.dao;

import com.orm.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAO {

    @Autowired
    private JpaTemplate jpaTemplate;

    public int saveProject(Project project){
        jpaTemplate.persist(project);
        return project.getProjectNo();
    }

    public Object updateTeamSize(int projectNo,int newSize){
        Project project = jpaTemplate.find(Project.class,projectNo);
        project.setTeamSize(newSize);
        return jpaTemplate.merge(project);
    }
}
