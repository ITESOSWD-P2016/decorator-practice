package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

public class NetbeansJIDE extends JavaIDE {

	public NetbeansJIDE(){
		description = "NetbeansJ IDE";
	}
	
	@Override
	public String start() {
		return "Starting " + description;
	}
}
