package com.ibm.apps.internal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class SampleController {

	@GetMapping("/")
	String getSampleMethod() {
        return "HELLO WORLD";
    }
}
