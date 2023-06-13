package com.UserTask.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserTask.entity.UserModel;
@Repository
public interface UserTaskRepository extends JpaRepository<UserModel, Integer> {

//	List<UserModel> findAll();

}
