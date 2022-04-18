package com.training.Application;

import com.training.history.History;
import com.training.historyService.HistoryService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		History url1=new History("Google.com", "11.53pm");
		History url2=new History("javapoint.com", "11.59pm");
		History url3=new History("Quora.com", "12.03am");
		History url4=new History("github.com", "12.08am");
		History url5=new History("youtube.com", "12.15am");
		History url6=new History("geekforgeek.com", "12.30am");
		History url7=new History("Leetcode.com", "12.45am");
		History url8=new History("gmail.com", "12.59am");
		History url9=new History("googlemeet.com", "1.25am");
		
		HistoryService service=new HistoryService();
		
		service.add(url1);
		service.add(url2);
		service.add(url3);
		service.add(url4);
		service.add(url5);
		service.add(url6);
		service.add(url7);
		service.add(url8);
		service.add(url9);
		
		service.recenturl();
	}

}
