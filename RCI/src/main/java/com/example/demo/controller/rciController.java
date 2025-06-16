package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.rci;
import com.example.demo.repository.rciRepository;

@RestController
public class rciController {
    @Autowired
	rciRepository rcirepository;
	
    @PostMapping("/jk")
	public rci rciTest(@RequestBody rci r)  {
		System.out.println("sdfghj");
		 rcirepository.save(r);
		return r;
		
	}
    
    @GetMapping("/retreive")
   	public List<rci> rciRetreive()  {
   		System.out.println("sdfghj");
   		return rcirepository.findAll();
   		
   		
   	}
   	
    @GetMapping("/retreive/{id}")
   	public rci rciRetreive(@PathVariable int id)  {
   		System.out.println("sdfghj");
   		return rcirepository.findById(id);
   		
   		
   	}
    
    @GetMapping("/update/{id}")
   	public rci rciUpdate(@PathVariable int id)  {
   		System.out.println("sdfghj");
   		return rcirepository.findById(id);
   		
   		
   	}
}
