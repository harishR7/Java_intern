package com.training;

import com.training.ifaces.Conditional;
import com.training.util.NewObjectFactory;
import com.training.util.ObjectFactory;

public class Application {
	public static void main(String []arr) {
		
		ObjectFactory factory=new ObjectFactory();
		Conditional profObj= factory.getConditional(1);
		Conditional studObj= factory.getConditional(2);
		System.out.println(studObj);
		
		System.out.println(profObj.test("chennai"));
		
		System.out.println("Allowance:="+factory.getValue(profObj, "chennai"));
		System.out.println("Allowance :"+factory.getValue(studObj,"90"));
		
		NewObjectFactory factoryNew=new NewObjectFactory();
		
		
		System.out.println(factoryNew.getConditional(3));
	}

}
