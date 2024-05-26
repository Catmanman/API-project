package com.project.demo.step_guide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stepguides")
public class step_guideControler {
    @Autowired
    private step_guideService stepGuideService;

    @GetMapping
    public List<step_guide> getAllStepGuides() {
        return stepGuideService.getAllstep_guide();
    }

    @GetMapping("/{guideId}")
    public step_guide getStepGuideById(@PathVariable Long guideId) {
        return stepGuideService.getStepGuideById(guideId);
    }

    @PostMapping
    public step_guide saveStepGuide(@RequestBody step_guide stepGuide) {
        return stepGuideService.saveStepGuide(stepGuide);
    }

    @PutMapping("/{guideId}")
    public step_guide updateStepGuide(@PathVariable Long guideId, @RequestBody step_guide stepGuide) {
        return stepGuideService.updateStepGuide(guideId, stepGuide);
    }

    @DeleteMapping("/{guideId}")
    public void deleteStepGuide(@PathVariable Long guideId) {
        stepGuideService.deleteStepGuide(guideId);
    }
}
