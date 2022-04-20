package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

public class LogToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=
				Logger.getLogger(LogToFile.class.getName());
		
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			log.info("Try Block Called");
			throw new Exception("Rk is a good coder");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			log.warning(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.warning(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			log.warning(e.getMessage());
		}
		
		
	}

}
