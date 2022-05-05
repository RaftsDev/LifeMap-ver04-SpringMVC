package com.lifemap.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lifemap.spring.entity.Tasks;

@Repository
public class TasksDAOImpl implements TasksDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Tasks> getTasks() {
		// TODO Auto-generated method stub
		
        Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Tasks> theQuery = currentSession.createQuery("from Tasks", Tasks.class);
		
		List<Tasks> tasks = theQuery.getResultList();
		
		return tasks;
	}

}
