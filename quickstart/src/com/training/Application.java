package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Greeting obj=new Greeting();
        obj.getMessage();
        // syatem is a private constructor so we can use it as a object;
     //   System s=new System();
        System.out.println(Greeting.getInfo());
       
	}

}
