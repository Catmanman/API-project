package com.project.demo.step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/steps")
public class stepControler {
    @Autowired
    private stepService stepService;

    @GetMapping
    public List<step> getAllSteps() {
        return stepService.getAllsteps();
    }

    @GetMapping("/{stepId}")
    public step getStepById(@PathVariable Long stepId) {
        return stepService.getStepById(stepId);
    }

    @PostMapping
    public step saveStep(@RequestBody step step) {
        return stepService.savestep(step);
    }

    @PutMapping("/{stepId}")
    public step updateStep(@PathVariable Long stepId, @RequestBody step step) {
        return stepService.updateStep(stepId, step);
    }

    @DeleteMapping("/{stepId}")
    public void deleteStep(@PathVariable Long stepId) {
        stepService.deleteStep(stepId);
    }
}
