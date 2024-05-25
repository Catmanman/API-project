package com.project.demo.step_guide;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.demo.materials.material;
import com.project.demo.project.Project;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "guides")
public class step_guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guideId;

    @OneToMany(mappedBy = "guide", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<material> materials;

    private String guideTitle;
    private String guideDesc;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    private int numberOfSteps;

    public Long getGuideId() {return guideId;}
    public void setGuideId(Long guideId) {this.guideId = guideId;}

    public List<material> getMaterials() {return materials;}
    public void setMaterials(List<material> materials) {this.materials = materials;}

    public String getGuideTitle() {return guideTitle;}
    public void setGuideTitle(String guideTitle) {this.guideTitle = guideTitle;}

    public String getGuideDesc() {return guideDesc;}
    public void setGuideDesc(String guideDesc) {this.guideDesc = guideDesc;}

    public Project getProject() {return project;}
    public void setProject(Project project) {this.project = project;}

    public int getNumberOfSteps() {return numberOfSteps;}
    public void setNumberOfSteps(int numberOfSteps) {this.numberOfSteps = numberOfSteps;}
}
