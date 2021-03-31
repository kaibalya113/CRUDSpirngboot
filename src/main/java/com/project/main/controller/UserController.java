package com.project.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.main.dao.UserDao;
import com.project.main.model.Person;

@RestController
@RequestMapping("/call")
@CrossOrigin(origins = "http://192.168.1.206:3000")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/index")
	public String index() {
		
		return "connection sucessful";
	}
	
	@GetMapping("/alluser")
	public List<Person> getAll(){
		List<Person> usr = userDao.findAll();
		return usr;
	}
	
	@PostMapping("/user/{id}")
	public Person getById(@PathVariable("id") Integer id) {
		Person person = userDao.findUserById(id);
		return person;
	}
	@PostMapping("getuser")
	public List<Person> searchUser(@RequestBody Map<String, String> fname){
		String name = fname.get("name");
		List<Person> person = userDao.getUserByfname(name);
		
		return person;
	}
}
