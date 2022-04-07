package com.training;

import com.training.poly.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public int getModel() {
		// TODO Auto-generated method stub
		return 2020;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public String toString() {
		return "ToyotaCar [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getPrice()=" + getPrice()
				+ "]";
	}

}
