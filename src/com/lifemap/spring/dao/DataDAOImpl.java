package com.lifemap.spring.dao;

import java.util.ArrayList;
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
import com.lifemap.spring.entity.UsersActivity;

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
	public Map<Branches, List> getUserTasks(int userId) {
		// TODO Auto-generated method stub

		Session currentSession = sessionFactory.getCurrentSession();

		// get all branches in ordered way
		Query<Branches> theQuery = currentSession
				.createQuery("from Branches B where B.user.id=" + userId + " order by id", Branches.class);
		// Query<Branches> theQuery = currentSession.createQuery("from Branches",
		// Branches.class);
		List<Branches> branches = theQuery.getResultList();

		// get list of parent branches
		List<Branches> parentList = new ArrayList();
		for (Branches branch : branches) {

			// Only parent branches
			if (branch.getParentId() == 0) {
				parentList.add(branch);

			}

		}

		// HashMap for parent Branches
		Map<Branches, List> parentMap = new HashMap();

		//filling collections with child branches and tasks
		for (Branches parentBranch : parentList) {

			//put to HashMap empty List
			parentMap.put(parentBranch,new ArrayList());
			
			// internal loop over whole collection of all branches
			for (Branches branch : branches) {
				
				// if branch is a child of current parent branch
				if (parentBranch.getId() == branch.getParentId()) {

					// get from HashMap - the List and put branch
					parentMap.get(parentBranch).add(branch);
				}

			}

		}
		
		

		

		// LinkedHashSet for unique value of branches
		/*
		 * LinkedHashSet<Branches> userBranches = new LinkedHashSet(); for (Tasks
		 * tempTask : userTasks) { userBranches.add(tempTask.getBranch()); }
		 */

		return parentMap;
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

	@Override
	public Users getUserByLogin(String inputedLogin) {
		// TODO Auto-generated method stub

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Users> theQuery = currentSession.createQuery("from Users U where U.login=" + inputedLogin, Users.class);

		// createQuery("from Users ")

		Users theUser = theQuery.getResultList().get(0);

		return theUser;

	}

	@Override
	public Users getUser(int currentUserId) {
		// TODO Auto-generated method stub

		Session currentSession = sessionFactory.getCurrentSession();

		Users theUser = currentSession.get(Users.class, currentUserId);
		return theUser;
	}

	@Override
	public void saveUser(Users user) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(user);
	}

	@Override
	public void deleteUser(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery = currentSession.createQuery("delete from Users where id=:userId");
		theQuery.setParameter("userId", theId);

		theQuery.executeUpdate();
	}
	
	@Override
	public void saveUsersActivity(UsersActivity usersActivity) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(usersActivity);

	}

}
