package com.project.demo.materials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materials")
public class materialControler {
    @Autowired
    private materialService materialService;

    @GetMapping
    public List<material> getAllMaterials() {
        return materialService.getAllMaterials();
    }

    @GetMapping("/{materialId}")
    public material getMaterialById(@PathVariable Long materialId) {
        return materialService.getMaterialById(materialId);
    }
    @PutMapping("/{materialId}")
    public material updateMaterial(@PathVariable Long materialId, @RequestBody material material) {
        return materialService.updateMaterial(materialId, material);}

    @PostMapping
    public material saveMaterial(@RequestBody material material) {
        return materialService.saveMaterial(material);
    }

    @DeleteMapping("/{materialId}")
    public void deleteMaterial(@PathVariable Long materialId) {
        materialService.deleteMaterial(materialId);
    }
}
