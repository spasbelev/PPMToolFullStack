package com.spas.ppmtool.services;

import com.spas.ppmtool.domain.Project;
import com.spas.ppmtool.exceptions.ProjectIdException;
import com.spas.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Transactional
    public Project saveOrUpdateProject(Project project) {

        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);

        } catch (Exception e) {
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
        }

    }

    public Project findProjectByIdentifier(String projectId) {
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
        if(project == null) {
            throw new ProjectIdException("Project ID '" + projectId + "' does not exists");
        }
        return project;
    }
}
