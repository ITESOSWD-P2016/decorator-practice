package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

public class NetbeansJIDE extends JavaIDE {

	public NetbeansJIDE(){
		description = "Netbeans IDE";
	}
	
	@Override
	public String start() {
		return "Starting " + description;
	}
}
