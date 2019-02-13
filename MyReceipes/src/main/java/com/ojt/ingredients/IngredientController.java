package com.ojt.ingredients;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ojt.ingredients.Ingredients;
import com.ojt.ingredients.IngredientsService;
import com.ojt.recepies.Receipe;
@RestController
public class IngredientController {
	
		@Autowired
		 private IngredientsService ingredientsService;
		@RequestMapping("/receipes/{id}/ingredients")
		public List<Ingredients> getallIngredients(@PathVariable int ingredientid )
		{
			return ingredientsService.getallIngredients();
		}
		@RequestMapping("/receipes/ingredients/{ingredientid}")
	    public Ingredients getIngredients(@PathVariable String id)
	    {
			return ingredientsService.getIngredients(id);
	    }
		@RequestMapping(method=RequestMethod.POST,value="/receipes/{rid}/ingredients")
		public void addIngredients(@RequestBody Ingredients ingredients,@PathVariable int rid)
		{
			ingredients.setReceipes(new Receipe(rid, "",""));
			ingredientsService.addIngredients(ingredients);
		}
		@RequestMapping(method=RequestMethod.PUT,value="/receipes/{rid}/ingredients/{ingredientid}")
		public void updateReceipe(@RequestBody int ingredientid,Ingredients ingredients,@PathVariable int rid)
	    {
			ingredients.setReceipes(new Receipe(rid, "",""));
			ingredientsService.updateIngredients(ingredients);
	    }
		@RequestMapping("/receipes/{receipeId}/ingredients/{id}")
		public void deleteIngredients(String id)
		{
			ingredientsService.deleteIngredients(id);
		}
	    
	}



