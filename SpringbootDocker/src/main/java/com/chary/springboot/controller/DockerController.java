package com.chary.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerController {
    @GetMapping("/welcome")
	public String getWelcome()
	{
		return "welcome to SpringBoot Docker Project";
	}
}
