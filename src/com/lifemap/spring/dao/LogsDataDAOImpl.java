package com.lifemap.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lifemap.spring.entity.UsersActivity;



@Repository
public class LogsDataDAOImpl implements LogsDataDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUsersActivity(UsersActivity usersActivity) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(usersActivity);

	}

}
