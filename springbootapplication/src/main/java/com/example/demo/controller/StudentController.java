package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Studentbean;
import com.example.demo.repository.StudentRepo;


@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
		@GetMapping("/admin")
		public String showMainPage() {
			System.out.println("hai");
			return "home";
		}
		@GetMapping("insert")
		public String insert() {
			//repo.save(student);
			
			System.out.println("/insert mapped");
			
			return "insert";
		}
		@PostMapping("insert/action")
		public String insertaction(Studentbean student) {
			repo.save(student);
			System.out.println(student.getName());
			System.out.println(student.getAddress());
			return "insert";
		}
		@GetMapping("view")
		public String view(Model model){
			List<Studentbean> studentList=new ArrayList<Studentbean>();
			studentList =repo.findAll();
			model.addAttribute("studentList",studentList);
			return "allStudents";
		}
		
		
		
		
	}	
		