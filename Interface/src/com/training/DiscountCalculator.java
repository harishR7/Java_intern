package com.training;

import com.training.iFaces.Conditional;

public class DiscountCalculator implements Conditional {

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value>500;
	}

	@Override
	public boolean negate(int value) {
		// TODO Auto-generated method stub
		return value>6000;
	}

}
