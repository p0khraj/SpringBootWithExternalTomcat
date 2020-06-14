package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disco.model.Student;
import com.disco.repo.StudentJdbcRepository;

 

@RestController
public class StartController {
	 @Autowired
	 StudentJdbcRepository studentRepository;
	private static final String template = "Hello, %s!";

   @RequestMapping("/greeting")
   public String greeting(@RequestParam(value="name", defaultValue="pukhraj") String name) {
      return String.format(template, name);
   }

   @RequestMapping("/getStudent")
   public String getStudentDetails(@RequestParam long id){
	  Student student= studentRepository.findById(id);
		/*
		 * String json= gson.toJson(student); return json;
		 */
	   return student.getName();
   }
   
}
  