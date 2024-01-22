package com.restful.Controllers;

import com.restful.Flow;
import com.restful.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowService {

    private final FlowRepository flowRepository;
    private final StepRepository stepRepository;

    @Autowired
    public FlowService(FlowRepository flowRepository, StepRepository stepRepository) {
        this.flowRepository = flowRepository;
        this.stepRepository = stepRepository;
    }

    // Creates a Flow
    public Flow createFlow(Flow flow) {
        return flowRepository.save(flow);
    }

    // Retrieves a Flow by id
    public Flow getFlow(Long id) {
        return flowRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Can't get flow!"));
    }

    // Starts a Flow - Returns First Step of the Flow
    public Step startFlow(Long id) {
        Flow flow = getFlow(id); // Uses the method above
        List<Step> steps = flow.getSteps();
        return steps != null && !steps.isEmpty() ? steps.get(0) : null;
    }
}
