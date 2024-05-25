package com.project.demo.step_guide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.demo.step_guide.step_guide;
import java.util.List;

@Service
public class step_guideService {
    @Autowired
    private step_guideRepository stepGuideRepository;

    public List<step_guide> getAllstep_guide() {
        return stepGuideRepository.findAll();
    }

    public com.project.demo.step_guide.step_guide getStepGuideById(Long guideId) {
        return stepGuideRepository.findById(guideId).orElse(null);
    }

    public com.project.demo.step_guide.step_guide saveStepGuide(step_guide step_guide) {
        return stepGuideRepository.save(step_guide);
    }

    public com.project.demo.step_guide.step_guide updateStepGuide(Long guideId, step_guide step_guide) {
        if (stepGuideRepository.existsById(guideId)) {
            step_guide.setGuideId(guideId);
            return stepGuideRepository.save(step_guide);
        }
        return null; // Or throw an exception if preferred
    }

    public void deleteStepGuide(Long guideId) {
        stepGuideRepository.deleteById(guideId);
    }
}
