package com.example.DeadPool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/go")
public class AverangeExecution {
 @GetMapping(path="/boy")
	public String check() {
		return "I am Immortal";
	}
}

 