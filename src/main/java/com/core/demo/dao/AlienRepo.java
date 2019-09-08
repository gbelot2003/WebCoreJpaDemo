package com.core.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.core.demo.models.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> 
{
	List<Alien> findByTech(String tech);
	
	List<Alien> findByIdGreaterThan(int id);
	
	@Query("from Alien where tech=?1 order by name")
	List<Alien> findByTechSorted(String tech);
	
}
