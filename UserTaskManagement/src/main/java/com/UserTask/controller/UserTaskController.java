package com.UserTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserTask.entity.UserModel;
import com.UserTask.service.UserTaskService;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
@RestController
public class UserTaskController {
   @Autowired
	UserTaskService service;

	@GetMapping("/getalltask")
	public List<UserModel> getAllTaskDetails() {
		System.out.println("inside get controller");
		return service.getAllTaskDetails1();
	}
	
	@PostMapping("/task")
	ResponseEntity<UserModel>  saveTasklDetails(@RequestBody UserModel taskdetails) {
		return new ResponseEntity <UserModel> (service.saveTaskDetails(taskdetails),HttpStatus.CREATED);
	}

	@PutMapping("/updatetask/{id}")
	public UserModel updateTaskDetailsById(@PathVariable("id") int taskid,@RequestBody UserModel taskdetails) {
		taskdetails.setTaskid(taskid);
     return  service.updateTaskDetailsById(taskid,taskdetails);
	}
	@DeleteMapping("/deletetask/{id}")
	public void  deleteTaskDetailsById(@PathVariable("id") int taskid) {
		
	       service.deleteTaskDetailsById(taskid);
	       System.out.println("employee record deleted sucessfully");
		}

	
}
