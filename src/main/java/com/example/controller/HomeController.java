package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private HomeService homeService;

	@GetMapping("/get-area/{radius}")
	public double getAreaOfCircle(@PathVariable int radius) {
		return homeService.calculateAreaOfCircle(radius);
	}

	@GetMapping("/test")
	public String test() {
		return "hello jii";
	}
	
	@GetMapping(path = "/get-area/{radius}", produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Double> areaOfCircle(@RequestParam int radius) {
	    double result =  homeService.calculateAreaOfCircle(radius);
	    return ResponseEntity.ok(result);
	  }

	  @GetMapping(path = "/pow", produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Double> pow(@RequestParam int basis, @RequestParam int exponent) {
		  double result =  homeService.pow(basis, exponent);

	    return ResponseEntity.ok(result);
	  }

	  @GetMapping(path = "/multiply", produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Double> multiply(@RequestParam int factor1, @RequestParam int factor2) {
		  double result =  homeService.multiply(factor1, factor2);

	    return ResponseEntity.ok(result);
	  }

	  @GetMapping(path = "/evict", produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<String> evictCache() {
		 homeService.evictCache();
	    return ResponseEntity.ok("Cache successfully evicted!");
	  }

}
