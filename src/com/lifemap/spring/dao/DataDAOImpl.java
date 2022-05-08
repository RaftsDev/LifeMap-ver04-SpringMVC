package com.lifemap.spring.dao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

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
	public Map<Branches, Collection> getUserTasks(int userId) {
		// TODO Auto-generated method stub

		Session currentSession = sessionFactory.getCurrentSession();

		// get the current user
		// Users currentUser = currentSession.get(Users.class, userId);

		/*
		 * Tasks logTask = currentSession.get(Tasks.class, 1002);
		 * 
		 * List<Tasks> currentUserTasks = null; currentUserTasks.add(logTask);
		 */

		// get all branches of current user

		// Query<Branches> theQuery = currentSession.createQuery("from Branches B where
		// B.user.id="+userId, Branches.class);

		// get all branches in ordered way
		Query<Branches> theQuery = currentSession
				.createQuery("from Branches B where B.user.id=" + userId + " order by id", Branches.class);
		// Query<Branches> theQuery = currentSession.createQuery("from Branches",
		// Branches.class);
		List<Branches> branches = theQuery.getResultList();

		// Branches branch = currentSession.get(Branches.class, 101);

		// get tasks from current user's branches

		// Get all tasks from all users
		// List<Tasks> currentUserTasks = branches.get(1).getTasks();
		// Query<Tasks> theQueryUsers = currentSession.createQuery("from Tasks",
		// Tasks.class);
		// List<Tasks> allTasks = theQueryUsers.getResultList();

		// if(!branches.isEmpty()) {

		// HashMap for transfer data to Controller
		Map<Branches, Collection> userTasksBranches = new HashMap();

		/*
		 * List<Tasks> userTasks = branches.get(0).getTasks();
		 * 
		 * for (int i = 1; i < branches.size(); i++) {
		 * 
		 * // get element tasks from array List<Tasks> tempTask =
		 * branches.get(i).getTasks(); userTasks.addAll(tempTask);
		 * 
		 * }
		 */

		// Iterate through List of branches and put tasks into HashMap
		for (Branches branch : branches) {

			if (!branch.getTasks().isEmpty()) {
				userTasksBranches.put(branch, branch.getTasks());
			}

		}

		// LinkedHashSet for unique value of branches
		/*
		 * LinkedHashSet<Branches> userBranches = new LinkedHashSet(); for (Tasks
		 * tempTask : userTasks) { userBranches.add(tempTask.getBranch()); }
		 */

		return userTasksBranches;
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
		// Query<Branches> theQuery = currentSession.createQuery("from Branches B where
		// B.user.id=100", Branches.class);

		List<Branches> branches = theQuery.getResultList();

		return branches;
	}

	@Override
	public void deleteTask(int theId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery = currentSession.createQuery("delete from Tasks where id=:tasksId");
		theQuery.setParameter("tasksId", theId);

		theQuery.executeUpdate();

	}

	@Override
	public Tasks getTask(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		Tasks theTask = currentSession.get(Tasks.class, theId);
		return theTask;
	}

	@Override
	public void saveTask(Tasks theTask) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(theTask);
		
	}

	@Override
	public Branches getBranch(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		Branches theBranch = currentSession.get(Branches.class, theId);
		return theBranch;
	}

}
