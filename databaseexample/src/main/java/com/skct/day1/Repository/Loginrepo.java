package com.skct.day1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skct.day1.example.Loginmodel;

public interface Loginrepo extends JpaRepository<Loginmodel, Integer> {

	Loginmodel findByuname(String uname);
	
	
	
}