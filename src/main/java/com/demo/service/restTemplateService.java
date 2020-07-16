package com.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class restTemplateService {

	@Autowired
	private RestTemplate restTemplate;

	public List<Object> getAllProducts() {
//		String api = "http://dummy.restapiexample.com/api/v1/employees";
//		Object[] products = restTemplate.getForObject(api, Object[].class);
//		return Arrays.asList(products);

		String api = "https://gorest.co.in/public-api/posts?_format=json&access-token=PD4eLAOuyY1BgsNuaAp4Do8er09fhkCaoMff";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> entity = new HttpEntity<Object>(headers);
		ResponseEntity<Object[]> response = restTemplate.exchange(api, HttpMethod.GET, entity, Object[].class);
//		Object[] products = restTemplate.getForObject(api, Object[].class);
		return Arrays.asList(response.getBody());

	}

}
