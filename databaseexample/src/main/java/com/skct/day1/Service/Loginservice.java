package com.skct.day1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skct.day1.Repository.Loginrepo;
import com.skct.day1.example.Loginmodel;

@Service
public class Loginservice {
	
	
		@Autowired
		private Loginrepo obj;
		
		public String checkLogin(String Uname, String pwd) {
		    Loginmodel user = obj.findByuname(Uname);
		    if (user == null) {
		      return "no user found";
		    }
		    else{
		    	if(user.getPwd().equals(pwd)) {	    		
		    		return"Login Succesfull"; 
		    	}
		    	else {
		    		return "Login Failed";
		    	}
		    }
		}
		public Loginmodel addUser(Loginmodel login) {
			return obj.save(login);
		}
		public List<Loginmodel>getUname()
		{
			return obj.findAll();
		}
}