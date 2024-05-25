package com.project.demo.step;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.demo.project.Project;
import com.project.demo.step_guide.step_guide;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "steps")
public class step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stepId;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "guide_id", nullable = false)
    private step_guide guide;

    private String stepName;
    private String stepDescription;

    @ElementCollection
    private List<String> materialsUsed;

    public Long getStepId() {return stepId;}
    public void setStepId(Long stepId) {this.stepId = stepId;}

    public Project getProject() {return project;}
    public void setProject(Project project) {this.project = project;}

    public step_guide getGuide() {return guide;}
    public void setGuide(step_guide guide) {this.guide = guide;}

    public String getStepName() {return stepName;}
    public void setStepName(String stepName) {this.stepName = stepName;}

    public String getStepDescription() {return stepDescription;}
    public void setStepDescription(String stepDescription) {this.stepDescription = stepDescription;}

    public List<String> getMaterialsUsed() {return materialsUsed;}
    public void setMaterialsUsed(List<String> materialsUsed) {this.materialsUsed = materialsUsed;}
}
