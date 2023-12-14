package com.orm.entities;

import javax.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_no")
    private int projectNo;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "team_size")
    private int teamSize;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "tenure")
    private int tenure;
}
