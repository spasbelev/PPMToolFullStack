package com.spas.ppmtool.exceptions;

public class ProjectIdExceptionResponse {
    private String projectIdentifier;

    ProjectIdExceptionResponse(String identifier) {
        this.projectIdentifier = identifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
