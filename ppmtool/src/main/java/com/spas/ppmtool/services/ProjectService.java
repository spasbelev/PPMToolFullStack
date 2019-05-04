package com.spas.ppmtool.services;

import com.spas.ppmtool.domain.Project;
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
        return projectRepository.save(project);
    }
}
