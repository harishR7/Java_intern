package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger("com.exapmle.Application");
		
		log.setLevel(Level.ALL);
		
		
		log.info("Info Message");
		log.warning("Warning MEssage ***********");
		log.severe("SEVERE Message %%%%%%%");
		log.fine("I am Fine Message  ###############");
		
		//System.out.println("Info Message");
		
	}

}
