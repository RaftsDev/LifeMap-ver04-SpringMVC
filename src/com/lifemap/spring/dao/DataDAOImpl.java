package com.lifemap.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lifemap.spring.entity.Branches;
import com.lifemap.spring.entity.Tasks;
import com.lifemap.spring.entity.Users;

@Repository
public class DataDAOImpl implements DataDAO {

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

	@Override
	public List<Tasks> getUserTasks(int userId) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//get the current user
		//Users currentUser = currentSession.get(Users.class, userId);
		
		
		
		/*Tasks logTask = currentSession.get(Tasks.class, 1002);
		
		List<Tasks> currentUserTasks = null;
		currentUserTasks.add(logTask);*/
		
		
		//get all branches of current user
		//int tempId = 100;
		Query<Branches> theQuery = currentSession.createQuery("from Branches B where B.user.id="+userId, Branches.class);
		
		//Query<Branches> theQuery = currentSession.createQuery("from Branches", Branches.class);
		List<Branches> branches = theQuery.getResultList();
		
		//Branches branch = currentSession.get(Branches.class, 101);
		
		
		//get tasks from current user's branches 
		
		
		//Get all tasks from all users
		//List<Tasks> currentUserTasks = branches.get(1).getTasks();
		//Query<Tasks> theQueryUsers = currentSession.createQuery("from Tasks", Tasks.class);
		//List<Tasks> allTasks = theQueryUsers.getResultList();
		
		//if(!branches.isEmpty()) {
		List<Tasks> currentUserTasks = branches.get(0).getTasks();
			for (int i=1; i<branches.size(); i++) {
				
				//get element tasks from array
				List<Tasks> tempTask = branches.get(i).getTasks();
				currentUserTasks.addAll(tempTask);
				//List<Tasks> currentUserTasks;
				//Check if branch has any task
				//if(tempTasks != null) {
				
				//Loop over branches
				/*for(int j=0; j<tempTask.size(); j++) {
					if(tempTasks.getId() == branches.get(j).getId()) {
						currentUserTasks.add(tempTasks);
					}*/
				}
					
					//currentUserTasks.addAll(tempTasks);
				
		
		return currentUserTasks;
}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Users> theQuery = currentSession.createQuery("from Users", Users.class);

		List<Users> users = theQuery.getResultList();

		return users;
	}

	@Override
	public List<Branches> getBranches() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Branches> theQuery = currentSession.createQuery("from Branches", Branches.class);
		//Query<Branches> theQuery = currentSession.createQuery("from Branches B where B.user.id=100", Branches.class);
		
		List<Branches> branches = theQuery.getResultList();
		
		return branches;
	}

}
