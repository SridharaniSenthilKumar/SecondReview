package com.skct.day1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skct.day1.example.example;
@Repository

public interface carRepo extends JpaRepository<example, Integer> {
	
	@Query(value="select * from example ",nativeQuery=true)
	public List<example> getAllData();
	
	@Query(value="select mname from example where example where noofcast = ?11",nativeQuery = true)
	public List<example>bymovieName(@Param("nocast")int noofcast);

}