package com.project.demo.materials;

import com.project.demo.project.Project;
import com.project.demo.step_guide.step_guide;
import com.project.demo.step.step;
import jakarta.persistence.*;

@Entity
@Table(name="materials")
public class material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long materialId;
    private String description;
    private int quantity;
    private String unitMeasure;
    private double cost;

    @ManyToOne
    @JoinColumn(name = "guide_id", nullable = false)
    private step_guide guide;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "stepid", nullable = false)
    private step step;

    public material(step step) {
        this.step = step;
    }

    public material() {

    }


    public Long getMaterialId() {return materialId;}
    public void setMaterialId(Long materialId) {this.materialId = materialId;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public String getUnitMeasure() {return unitMeasure;}
    public void setUnitMeasure(String unitMeasure) {this.unitMeasure = unitMeasure;}

    public double getCost() {return cost;}
    public void setCost(double cost) {this.cost = cost;}
}
