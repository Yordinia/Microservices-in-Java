package com.restful.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/step")
public class StepController {
    @Autowired
    private StepService stepService;
    @GetMapping("/getStep")
    public String getStep() {
        return "this is Step / get STEP !";
    }

}
