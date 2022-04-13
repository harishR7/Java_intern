package com.training.model;

import java.util.Set;
import java.util.TreeSet;

import com.training.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product washingMachine =new Product(101, "WashingMachine", 10000);
		Product motor=new Product(102, "Motor", 3000);
		Product hammer=new Product(105, "hammer", 1000);
		Product pump =new Product(123, "pump", 5435);
		Product wire =new Product(234, "wire", 2323);
		
		Set<Product> set=new TreeSet<>();
		set.add(wire);
		set.add(hammer);
		set.add(washingMachine);
		set.add(pump);
		set.add(motor);
		
		ProductService service=new ProductService(set);
		System.out.println(service.getTopThree());
		

	}

}
