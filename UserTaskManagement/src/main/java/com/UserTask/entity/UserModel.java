package com.UserTask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Task_Details")
public class UserModel {

//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int taskid;
	private String description;
	private String tasktitle;
	public UserModel(int taskid, String description, String tasktitle) {
		super();
		this.taskid = taskid;
		this.description = description;
		this.tasktitle = tasktitle;
	}
	public UserModel() {
	
		// TODO Auto-generated constructor stub
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTasktitle() {
		return tasktitle;
	}
	public void setTasktitle(String tasktitle) {
		this.tasktitle = tasktitle;
	}
	
	
}
