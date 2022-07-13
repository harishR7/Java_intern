package com.training.util;

import com.training.ifaces.Conditional;
import com.training.model.Professor;
import com.training.model.Student;

public class ObjectFactory {
	public Conditional getConditional(int key) {
		
		switch(key) {
		case 1:
			return new Professor("phd");
		
		case 2:
			return new Student(89);
			default:
				return null;
		
		}
	}
	public double getValue(Conditional  obj,Object value) {
		// Here obj refernce type is Conditional but objects;
		//are Student or professor or principal
		//at runtime test method in the respective object is called
		//hence run time  polymorphism
		boolean result=obj.test(value);
		double travelAllowance=1000;
		if(result){
			travelAllowance=2000;
		}
		return travelAllowance;
	}
}
