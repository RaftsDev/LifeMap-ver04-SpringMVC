package com.lifemap.spring.controller;

import java.util.Collection;
import java.util.HashMap;
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
	
	@GetMapping("/loginPage")
	public String loginPage(Model theModel) {
		
		Users theUser = new Users();
		
		theModel.addAttribute("user", theUser);
		
		return "login-page";
	}
	
	@PostMapping("/checkLogin")
	public String checkLogin(@ModelAttribute("user") Users theUser) {
		
		//int currentUserId = 100;
		
		//get HashMap from DAO
		//Map<Branches, Collection> theUserBranchesTasks = dataService.getUserTasks(currentUserId);
		
		//transfer tasks and branches to view file
		//theModel.addAttribute("userTasks", theUserTasks.get("userTasks"));
		//theModel.addAttribute("userBranchesTasks",theUserBranchesTasks);
		
		String inputedLogin = theUser.getLogin();
		String inputedPassword = theUser.getPwd();
		
		String page = "login-page";
		
		if(inputedLogin.equals("John")) {
			page = "redirect:/userTasks";
		}
		
		if(inputedLogin.equals("Admin")) {
			page = "redirect:/adminPage";
		}
		
		//Users realUser = dataService.getUserByLogin(inputedLogin);
		
		/*if(realUser.getPwd() == inputedPassword) {
			
		}*/
		
		
		//return "redirect:/userTasks";
		return page;
	}
	
	@GetMapping("/userTasks")
	public String listTasks(Model theModel) {
		
		int currentUserId = 100;
		
		//get user
		Users theUser = dataService.getUser(currentUserId);
		
		theModel.addAttribute("user",theUser);
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
		
		return "update-task-form";
	}
	
	@PostMapping("/saveTask")
	public String saveTask(@ModelAttribute("task") Tasks theTask) {
		
		dataService.saveTask(theTask);
		
		return "redirect:/userTasks";
	}
	
	@GetMapping("/addTask")
	public String formAddTask(@RequestParam("branchId") int theId, Model theModel) {
		
		Branches theBranch = dataService.getBranch(theId);
		
		Tasks theTask = new Tasks();
	
		//Map<Branches, Tasks> tmpBranchTask = new HashMap<Branches, Tasks>();
		
		//tmpBranchTask.put(theBranch, theTask);
		
		/*theModel.addAttribute("branch", theBranch);
		
		theModel.addAttribute("task",theTask);*/
		
		//theModel.addAttribute("tmpBranchTask", tmpBranchTask);
		
		theTask.setBranch(theBranch);
		
		theModel.addAttribute("task", theTask);
		
		return "add-task-form";
	}
	
	@PostMapping("/saveNewTask")
	public String saveNewTask(@ModelAttribute("task") Tasks theTask) {
		
		//Branches theBranch = dataService.getBranch(101);
		
		//theTask.setBranch(theBranch);
				
		dataService.saveTask(theTask);
		
		return "redirect:/userTasks";
	}
	
	@GetMapping("/aboutPage")
	public String aboutPage(Model theModel) {
	
		
		return "about";
	}
	
	@GetMapping("/contactPage")
	public String contactPage(Model theModel) {
	
		
		return "contacts-page";
	}
	
	@GetMapping("/adminPage")
	public String adminPage(Model theModel) {
		
		
		//get HashMap from DAO
		List<Users> theUsers = dataService.getUsers();
		
		//transfer tasks and branches to view file
		//theModel.addAttribute("userTasks", theUserTasks.get("userTasks"));
		theModel.addAttribute("users",theUsers);
		
		return "admin-page";
	}
	
	
	
	@GetMapping("/updateUser")
	public String updateUser(@RequestParam("userId") int theId, Model theModel) {
		
		
		//get HashMap from DAO
		Users theUser = dataService.getUser(theId);
		
		//transfer tasks and branches to view file
		//theModel.addAttribute("userTasks", theUserTasks.get("userTasks"));
		theModel.addAttribute("user",theUser);
		
		return "update-user-page";
	}
	
}


