package com.project.demo.project;
import com.project.demo.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long projectId) {return projectRepository.findById(projectId).orElse(null);}

    public Project updateProject(Long projectId, Project project) {
        if (projectRepository.existsById(projectId)) {
            project.setProjectId(projectId);
            return projectRepository.save(project);
        }
        return null;
    }


    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(Long projectId) {
        projectRepository.deleteById(projectId);
    }
}
