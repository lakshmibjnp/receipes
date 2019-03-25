package com.company.scenario.service;

import java.util.List;

import com.company.scenario.entity.IngredientsEntity;
import com.company.scenario.entity.ReceipeEntity;
import com.company.scenario.model.Ingredients;
import com.company.scenario.model.Receipe;



public interface ReciepeService {
	public List<ReceipeEntity> getAllReciepies();

	public List<IngredientsEntity> getAllIngredients();

	public List<ReceipeEntity> saveReciepe(List<Receipe>receipe);

	public List<ReceipeEntity> getReciepeByIngredients(Ingredients ingredient);
	public boolean existsByTitle(String receipeTitle);
}
