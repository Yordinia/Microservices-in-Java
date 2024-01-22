package com.restful.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flow")
public class FlowController {
    @GetMapping("/getFlow")
    public String getFlow() {
        return "this is flow / get flow !";
    }
    @Autowired
    private FlowService flowService;

}
