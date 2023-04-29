package com.skct.day1.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skct.day1.Service.Loginservice;
import com.skct.day1.example.Loginmodel;
@RestController
@RequestMapping("/page")
public class Logincontroller {
	
		@Autowired
		private Loginservice service;
		
		  @PostMapping("/login")
		  public String login(@RequestBody Map<String, String> loginData) {
		    String uname = loginData.get("uname");
		    String pwd = loginData.get("pwd");
		    String result = service.checkLogin(uname, pwd);
		    return result;
		  }
		  @PostMapping("/adduser")
		  	public Loginmodel AddUser(@RequestBody Loginmodel lgn) {
			  return service.addUser(lgn);
		  }
		  @GetMapping
		  public List<Loginmodel>listAll(){
			  return service.getUname();
		  }
		  


}