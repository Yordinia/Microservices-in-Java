package com.restful.Controllers;

import com.restful.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService {
    private final StepRepository stepRepository;
    //Autowired by constructor
    @Autowired
    public StepService(StepRepository stepRepository){
        this.stepRepository = stepRepository;
    }

//    public Step makeChoice(Long id, String choice){
//        Step step = stepRepository.findById(id).orElseThrow( );
//        return stepRepository.save(step);
//    }
}
