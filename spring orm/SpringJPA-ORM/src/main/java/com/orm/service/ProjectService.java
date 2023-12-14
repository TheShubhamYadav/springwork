package com.orm.service;

import com.orm.dao.ProjectDAO;
import com.orm.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    @Transactional(readOnly = false)
    public int newProject(Project project){
        return projectDAO.saveProject(project);
    }

    @Transactional(readOnly = false)
    public Object updateProjectTeamSize(int projectNo,int teamSize){
        return projectDAO.updateTeamSize(projectNo,teamSize);
    }


}
