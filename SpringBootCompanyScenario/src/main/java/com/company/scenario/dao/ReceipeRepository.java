package com.company.scenario.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.scenario.entity.ReceipeEntity;



@Repository
public interface ReceipeRepository extends CrudRepository<ReceipeEntity, Integer> {

	boolean existsByTitle(String receipeTitle);
	
}
