package com.UserTask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserTask.Repository.UserTaskRepository;
import com.UserTask.entity.UserModel;

@Service
public class UserTaskService {
  @Autowired
	UserTaskRepository repository;

public List<UserModel> getAllTaskDetails1() {
	// TODO Auto-generated method stub
	return repository.findAll();
}

public UserModel saveTaskDetails(UserModel taskdetails) {
	// TODO Auto-generated method stub
	return repository.save(taskdetails);
}

public UserModel updateTaskDetailsById(int taskid, UserModel taskdetails) {
	// TODO Auto-generated method stub
	return repository.save(taskdetails);
}

public void deleteTaskDetailsById(int taskid) {
	// TODO Auto-generated method stub
	repository.deleteById(taskid);
}

//public UserModel saveTaskDetails(UserModel taskdetails) {
//	// TODO Auto-generated method stub
//	return null;
//}

//public List<UserModel> getAllTaskDetails() {
//	// TODO Auto-generated method stub
//	return null;
}
	

