package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	Repository serviceRepository;
	
	@Autowired
	Services service;
	
	@GetMapping("/get")
	List<todo> getList(){
		return serviceRepository.findAll();
	}
	@PostMapping("/post")
	public todo create(@RequestBody todo td) {
		return serviceRepository.save(td);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		return service.delList(id);
	}
}	