package com.training.history;

import java.util.ListIterator;

public class History {
	
	private String url;
	private String time;
	
	
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}


	public History(String url, String time) {
		super();
		this.url = url;
		this.time = time;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "History [url=" + url + ", time=" + time + "]";
	}


	
	}

