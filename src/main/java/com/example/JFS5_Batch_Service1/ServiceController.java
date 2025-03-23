package com.example.JFS5_Batch_Service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @GetMapping("/test")
            public String getMessage()
                {
                    return "Getting message from GateWay";

    }


}
