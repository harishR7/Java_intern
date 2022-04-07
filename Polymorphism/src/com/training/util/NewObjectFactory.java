package com.training.util;

import com.training.ifaces.Conditional;
import com.training.model.Principal;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		Conditional value=null;
		if(key==3) {
			value=new Principal("JIT");
		}
		else {
			value=super.getConditional(key);
		}
		return value;
	}
	
	
}
