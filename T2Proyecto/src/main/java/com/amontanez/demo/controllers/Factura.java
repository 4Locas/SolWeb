package com.amontanez.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/factura")
public class Factura {
	
	@RequestMapping("/")
	public String inicio() {
		return "factura/index";
	}
	
}
