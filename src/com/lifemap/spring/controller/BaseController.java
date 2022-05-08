package com.lifemap.spring.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lifemap.spring.entity.Branches;
import com.lifemap.spring.entity.Tasks;
import com.lifemap.spring.entity.Users;
import com.lifemap.spring.service.DataService;

@Controller
@RequestMapping("/")
public class BaseController {

	
	/*@Autowired
	private CustomerService customerService;*/
	@Autowired
	private DataService dataService;
	
	/*@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Customer> theCustomers = customerService.getCustomers();
		
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}*/
	
	@GetMapping("/userTasks")
	public String listTasks(Model theModel) {
		
		int currentUserId = 100;
		
		//get HashMap from DAO
		Map<Branches, Collection> theUserBranchesTasks = dataService.getUserTasks(currentUserId);
		
		//transfer tasks and branches to view file
		//theModel.addAttribute("userTasks", theUserTasks.get("userTasks"));
		theModel.addAttribute("userBranchesTasks",theUserBranchesTasks);
		
		
		return "user-tasks";
	}
	
	@GetMapping("/allTasks")
	public String listAllTasks(Model theModel) {
		
		
		List<Tasks> theTasks = dataService.getTasks();
		
		theModel.addAttribute("tasks", theTasks);
		
		return "all-tasks";
	}
	
	@GetMapping("/allUsers")
	public String listAllUsers(Model theModel) {
		
		
		List<Users> theUsers = dataService.getUsers();
		
		theModel.addAttribute("users", theUsers);
		
		return "all-users";
	}
	
	@GetMapping("/allBranches")
	public String listAllBranches(Model theModel) {
		
		
		List<Branches> theBranches = dataService.getBranches();
		
		theModel.addAttribute("branches", theBranches);
		
		return "all-branches";
	}
	
	@GetMapping("/deleteTask")
	public String deleteTask(@RequestParam("taskId") int theId) {
		
		dataService.deleteTask(theId);
		
		return "redirect:/userTasks";
	}
	
	
	
	@GetMapping("/updateTask")
	public String showFormForUpdate(@RequestParam("taskId") int theId, Model theModel) {
		
		Tasks theTask = dataService.getTask(theId);
		
		theModel.addAttribute("task", theTask);
		
		return "task-form";
	}
	
	@PostMapping("/saveTask")
	public String saveTask(@ModelAttribute("task") Tasks theTask) {
		
		dataService.saveTask(theTask);
		
		return "redirect:/userTasks";
	}
	
	/*
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
		
		Customer theCustomer = customerService.getCustomer(theId);
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
	}
	*/
	
}


