package com.ojt.ingredients;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IngredientsRepository extends CrudRepository<Ingredients,String>{
	public List<Ingredients> findByTitle(String  title);

	
 
	


}
