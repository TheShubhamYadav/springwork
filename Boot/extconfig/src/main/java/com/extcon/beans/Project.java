package com.extcon.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Project {

    @Value("${projectId}")
    private int projectId;
    @Value("${projectName}")
    private String projectName;
    @Value("${orgName}")
    private String orgName;
    @Value("${teamsize}")
    private int teamsize;

}
