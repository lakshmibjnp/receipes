package com.ojt.recepies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceipeService {
	@Autowired
	private ReceipeRepository receipeRepository;
	
	public List<Receipe> getallReceipes()
	{
		List<Receipe> receipe=new ArrayList<>();
		receipeRepository.findAll()
		.forEach(receipe::add);
		return receipe;
		
		}
	public Receipe getReceipe(String id)
	{
		return receipeRepository.findOne(id);
	}
	public void addReceipe(Receipe receipe)
	{
		receipeRepository.save(receipe);
	}
	public void updateReceipe(String id,Receipe receipe)
	{
		receipeRepository.save(receipe);
	}
	public void deleteReceipe(String id)
	{
		receipeRepository.delete(id);
	} 
	 
	}


