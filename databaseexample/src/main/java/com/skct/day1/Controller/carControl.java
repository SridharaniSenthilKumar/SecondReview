package com.skct.day1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skct.day1.Service.carServ;
import com.skct.day1.example.example;

@RestController
public class carControl {
	@Autowired
	public carServ cserv;
	@PostMapping("/save")
	public example addDetails(@RequestBody example obj) {
		return cserv.addDetails(obj);
	}
	@GetMapping("/saveInform")
	public List<example> getDetails(){
		return cserv.getInfo();
		}
	@PutMapping("/putdata")
	public example update(@RequestBody example obj) {
		return cserv.UpdateInfo(obj);
	}
	
	@DeleteMapping("/deleteid/{noofcast}")
	public String delete1(@PathVariable("noofcast") int noofcast) {
		cserv.deleteInfo(noofcast);
		return "id "+noofcast+" deleted";
	}
	@DeleteMapping("del")
	public String del1(@RequestParam("noofcast") int noofcast) {
	 cserv.deleteInfo(noofcast);
	 return "id "+noofcast+" deleted";
	}
	//sorting
	@GetMapping("/pageget/{mname}")
	public List<example>sortmovie(@PathVariable("mname")String mname)
	{
		return cserv.sortAsec(mname);
	}
	//pagination
	@GetMapping("/pagination/{pageno}/{pagesize}")
	public List<example>page(@PathVariable("pageno")int pageno,@PathVariable("pagesize")int pagesize){
	{
		return cserv.pagination(pageno,pagesize);
	}
	
	

}
}