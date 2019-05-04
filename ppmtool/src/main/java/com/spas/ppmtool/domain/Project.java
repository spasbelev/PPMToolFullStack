package com.spas.ppmtool.domain;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Project name cannot be blank")
    private String projectName;
    @NotBlank(message = "Project identifier cannot be blank")
    @Size(min = 4, max = 5, message = "Please use 4 to 5 characters")
    @Column(updatable = false, unique = true)
    private String projectIdentifier;
    @NotBlank(message = "Project description is required")
    private String description;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date endDate;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date updatedAt;

    public Project() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setProjectIdentifier(String identifier) {
        this.projectIdentifier = identifier;
    }

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setEndDate(Date date) {
        this.endDate = date;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setUpdatedAt(Date date) {
        this.updatedAt = date;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
