package com.bcp.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "project")
public class Project {
    private int id;
    private String projectName;
    private int teamSize;
    private String clientName;
}
