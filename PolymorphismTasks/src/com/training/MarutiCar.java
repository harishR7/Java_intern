package com.training;

import com.training.poly.Automobile;

public class MarutiCar implements Automobile {
	
//	public void printQuote(Automobile poly) {
//		String value
//	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public int getModel() {
		// TODO Auto-generated method stub
		return 2019 ;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 450000;
	}

	@Override
	public String toString() {
		return "MarutiCar [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getPrice()=" + getPrice()
				+ "]";
	}

}
