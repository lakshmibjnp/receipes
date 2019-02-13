
package com.ojt.ingredients;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.ojt.recepies.Receipe;

@Entity
public class Ingredients {
	@Id
	private int ingredientid;
	private String ingerdientname;
	@ManyToOne
	private Receipe receipes;
	public Ingredients(int ingredientid, String ingerdientname,int rid) {
		super();
		this.ingredientid = ingredientid;
		this.ingerdientname = ingerdientname;
		this.receipes=new Receipe(rid, "","");
	}
	public int getIngredientid() {
		return ingredientid;
	}
	public void setIngredientid(int ingredientid) {
		this.ingredientid = ingredientid;
	}
	public String getIngerdientname() {
		return ingerdientname;
	}
	public void setIngerdientname(String ingerdientname) {
		this.ingerdientname = ingerdientname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingerdientname == null) ? 0 : ingerdientname.hashCode());
		result = prime * result + ingredientid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredients other = (Ingredients) obj;
		if (ingerdientname == null) {
			if (other.ingerdientname != null)
				return false;
		} else if (!ingerdientname.equals(other.ingerdientname))
			return false;
		if (ingredientid != other.ingredientid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ingredients [ingredientid=" + ingredientid + ", ingerdientname=" + ingerdientname + "]";
	}
	public Receipe getReceipes() {
		return receipes;
	}
	public void setReceipes(Receipe receipes) {
		this.receipes = receipes;
	}
	
}
