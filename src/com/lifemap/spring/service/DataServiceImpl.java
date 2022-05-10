package com.lifemap.spring.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lifemap.spring.dao.DataDAO;
import com.lifemap.spring.entity.Branches;
import com.lifemap.spring.entity.Tasks;
import com.lifemap.spring.entity.Users;

@Service
public class DataServiceImpl implements DataService {

	
	@Autowired
	private DataDAO dataDAO;
	
	@Override
	@Transactional
	public List<Tasks> getTasks() {
		
		return dataDAO.getTasks();
	}

	@Override
	@Transactional
	public Map<Branches, Collection> getUserTasks(int userId) {
		// TODO Auto-generated method stub
		
		
		return dataDAO.getUserTasks(userId);
	}

	@Override
	@Transactional
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return dataDAO.getUsers();
	}

	@Override
	@Transactional
	public List<Branches> getBranches() {
		// TODO Auto-generated method stub
		return dataDAO.getBranches();
	}

	@Override
	@Transactional
	public void deleteTask(int theId) {
		// TODO Auto-generated method stub
		dataDAO.deleteTask(theId);
	}

	@Override
	@Transactional
	public Tasks getTask(int theId) {
		// TODO Auto-generated method stub
		return dataDAO.getTask(theId);
	}

	@Override
	@Transactional
	public void saveTask(Tasks theTask) {
		// TODO Auto-generated method stub
		dataDAO.saveTask(theTask);
	}

	@Override
	@Transactional
	public Branches getBranch(int theId) {
		// TODO Auto-generated method stub
		return dataDAO.getBranch(theId);
	}

	@Override
	@Transactional
	public Users getUserByLogin(String inputedLogin) {
		// TODO Auto-generated method stub
		return dataDAO.getUserByLogin(inputedLogin);
	}

	@Override
	@Transactional
	public Users getUser(int currentUserId) {
		// TODO Auto-generated method stub
		return dataDAO.getUser(currentUserId);
	}

	@Override
	@Transactional
	public void saveUser(Users theUser) {
		// TODO Auto-generated method stub
		dataDAO.saveUser(theUser); 
	}

	@Override
	@Transactional
	public void deleteUser(int theId) {
		// TODO Auto-generated method stub
		dataDAO.deleteUser(theId);
	}

}
