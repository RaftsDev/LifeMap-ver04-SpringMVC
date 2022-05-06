package com.lifemap.spring.dao;

import java.util.List;

import com.lifemap.spring.entity.Branches;
import com.lifemap.spring.entity.Tasks;
import com.lifemap.spring.entity.Users;

public interface DataDAO {
	
	public List<Tasks> getTasks();

	public List<Tasks> getUserTasks(int userId);

	public List<Users> getUsers();

	public List<Branches> getBranches();


}
