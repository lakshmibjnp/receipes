package com.company.scenario.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.scenario.entity.IngredientsEntity;



@Repository
public interface IngredientRepository extends CrudRepository<IngredientsEntity, Integer> {
	List<IngredientsEntity> findByIngredient(String ingredient);
}
