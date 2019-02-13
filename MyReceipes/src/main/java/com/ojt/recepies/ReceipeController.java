package com.ojt.recepies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceipeController {
	@Autowired
	 private ReceipeService receipeService;
	@RequestMapping("/welcome")
	public String getwelcome()
	{
	return "my Welcome page";	
	}
	@RequestMapping("/receipes")
	public List<Receipe> getallReceipes()
	{
		return receipeService.getallReceipes();
	}
	@RequestMapping("/receipes/{id}")
    public Receipe getReceipe(String id)
    {
		return receipeService.getReceipe(id);
    }
	@RequestMapping(method=RequestMethod.POST,value="/receipes")
	public void addReceipe(@RequestBody Receipe receipe)
	{
		receipeService.addReceipe(receipe);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/receipes/{id}")
	public void updateReceipe(@RequestBody String id,Receipe receipe)
    {
    	receipeService.updateReceipe(id, receipe);
    }
	@RequestMapping("/receipes/{id}")
	public void deleteReceipe(String id)
	{
		receipeService.deleteReceipe(id);
	}
    
}
