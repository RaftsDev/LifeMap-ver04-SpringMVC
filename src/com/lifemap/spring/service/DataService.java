package com.lifemap.spring.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.lifemap.spring.entity.Branches;
import com.lifemap.spring.entity.Tasks;
import com.lifemap.spring.entity.Users;

public interface DataService {

	public List<Tasks> getTasks();
	
	public Map<Branches,Collection> getUserTasks(int userId);

	public List<Users> getUsers();

	public List<Branches> getBranches();
	
	public void deleteTask(int theId);

	public Tasks getTask(int theId);

	public void saveTask(Tasks theTask);

	public Branches getBranch(int theId);

	public Users getUserByLogin(String inputedLogin);

	public Users getUser(int currentUserId);

	public void saveUser(Users theUser);

	public void deleteUser(int theId);
}
