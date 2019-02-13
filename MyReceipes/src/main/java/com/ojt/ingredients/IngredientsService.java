package com.ojt.ingredients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ojt.ingredients.Ingredients;
@Service
public class IngredientsService {
	private  IngredientsRepository ingredientsRepository;
	public List< Ingredients> getallIngredients()
	{
		List< Ingredients> ingredients=new ArrayList<>();
		 ingredientsRepository.findAll()
		.forEach (ingredients::add);
		return  ingredients;
		
		}
	public  Ingredients getIngredients(String id)
	{ 
		ingredientsRepository.findByTitle("title");
		return  ingredientsRepository.findOne(id);
	}
	public void addIngredients( Ingredients  ingredients)
	{
		 ingredientsRepository.save(ingredients);
	}
	public void updateIngredients(Ingredients ingredients)
	{
		 ingredientsRepository.save(ingredients);
	}
	public void deleteIngredients(String id)
	{
		 ingredientsRepository.delete(id);
	} 
	 
	

}
