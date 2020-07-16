package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.restTemplateService;

@RestController
public class restTemplateController {

	@Autowired
	private restTemplateService restService;

	@GetMapping("/getall")
	public List<Object> getallProducts() {
		return restService.getAllProducts();
	}

}
