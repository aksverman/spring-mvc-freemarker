package com.rudra.aks.freemarker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rudra.aks.freemarker.model.User;

@Controller
public class FreeMarkerController {

	private static Logger logger = LogManager.getLogger(FreeMarkerController.class);
	private static List<User>	userList = new ArrayList<User>();
	private static Map<Integer, User> usersMap = new HashMap<Integer, User>();
	
	static {
		logger.info("Adding default users to list");
		userList.add(new User("aks", "india"));
		userList.add(new User("rudra", "kailash"));
		
		logger.info("Adding default to user map");
		usersMap.put(1, new User("first", "user"));
		usersMap.put(2, new User("second", "user"));
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET)
	public String hello() {
		logger.info("Redirecting to list users...");
		return "redirect:/listUsers";
	}
	
	@RequestMapping( value = "/listUsers", method = RequestMethod.GET)
	public String	listUser( @ModelAttribute("model") ModelMap model) {
		model.addAttribute("usersList", userList);
		return "index";
	}
	
	@RequestMapping( value="/addUser", method = RequestMethod.POST) 
	public String	addUser( @ModelAttribute("user") User user) {
		logger.info("Adding user to list : " + user);
		if(user != null)
			userList.add(user);
		logger.info("User added");
		return "redirect:/listUsers";
	} 
	
	@RequestMapping( value="/mapUser", method = RequestMethod.GET)
	public String	mapUser(@ModelAttribute("model") ModelMap model ) {
		logger.info("Fetching users map...");
		model.addAttribute("usersMap", usersMap);
		return "mapuser";
	}
}
