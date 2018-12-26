package com.utn.jpy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/holamundo")
	public String holaSpring() {
		return "hola mundo desde SpringBoot";
	}
}
