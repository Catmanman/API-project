package com.project.demo.materials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class materialService {
    @Autowired
    private materialRepository materialRepository;

    public List<material> getAllMaterials() {
        return materialRepository.findAll();
    }

    public material getMaterialById(Long materialId) {
        return materialRepository.findById(materialId).orElse(null);
    }

    public material saveMaterial(material material) {
        return materialRepository.save(material);
    }

    public void deleteMaterial(Long materialId) {
        materialRepository.deleteById(materialId);
    }

    public material updateMaterial(Long materialId, material material) {
        if (materialRepository.existsById(materialId)) {
            material.setMaterialId(materialId);
            return materialRepository.save(material);
        }
        return null;
    }}
