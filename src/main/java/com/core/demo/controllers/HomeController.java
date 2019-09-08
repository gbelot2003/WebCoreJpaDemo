package com.core.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.core.demo.dao.AlienRepo;
import com.core.demo.models.Alien;

@Controller
public class HomeController {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/logout-success")
	public ModelAndView logout()
	{
		ModelAndView mv = new ModelAndView("logout");
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView vm = new ModelAndView();
		vm.setViewName("home");
		return vm;
	}
	
	@RequestMapping("/store")
	public ModelAndView store(Alien alien)
	{
		ModelAndView vm = new ModelAndView();
		repo.save(alien);
		vm.setViewName("home");
		return vm;
	}
	
	@RequestMapping("/show")
	public ModelAndView show(@RequestParam String tech)
	{
		ModelAndView vm = new ModelAndView("show");
		Optional<Alien> alien = repo.findById(101);
		
		System.out.println(repo.findByTech(tech));
		
		System.out.println(repo.findByIdGreaterThan(102));
		System.out.println(repo.findByTechSorted(tech));

		
		vm.addObject(alien);
	
		return vm;
	}
}
	