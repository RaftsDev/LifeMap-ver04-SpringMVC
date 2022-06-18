package com.lifemap.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="users-activity")
public class UsersActivity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="event")
	private String activityEvent;
	

	public UsersActivity() {
		
	}

	public UsersActivity(String activityEvent) {
		
		this.activityEvent = activityEvent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivityEvent() {
		return activityEvent;
	}

	public void setActivityEvent(String activityEvent) {
		this.activityEvent = activityEvent;
	}

	@Override
	public String toString() {
		return "UsersActivity [id=" + id + ", activityEvent=" + activityEvent + "]";
	}


	
}




