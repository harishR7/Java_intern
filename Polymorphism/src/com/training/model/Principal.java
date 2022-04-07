package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional {
	private String typeOfCollege;

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Principal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	@Override
	public boolean test(Object value) {
		String values=(String)value;
		boolean result =true;
		if(values.toLowerCase().equals("JIT")) {
			result =true ;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Principal [typeOfCollege=" + typeOfCollege + "]";
	}
	
	
}
