package com.lifemap.spring.service;

import java.util.List;

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
	public List<Tasks> getUserTasks(int userId) {
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

}
