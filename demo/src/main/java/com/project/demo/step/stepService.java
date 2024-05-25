package com.project.demo.step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stepService {
    @Autowired
    private stepRepository stepRepository;

    public List<step> getAllsteps() {
        return stepRepository.findAll();
    }

    public step getStepById(Long stepId) {
        return stepRepository.findById(stepId).orElse(null);
    }

    public step savestep(step step) {
        return stepRepository.save(step);
    }

    public step updateStep(Long stepId, step step) {
        if (stepRepository.existsById(stepId)) {
            step.setStepId(stepId);
            return stepRepository.save(step);
        }
        return null; // Or throw an exception if preferred
    }

    public void deleteStep(Long stepId) {
        stepRepository.deleteById(stepId);
    }
}
