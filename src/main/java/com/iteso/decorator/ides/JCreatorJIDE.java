package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

public class JCreatorJIDE extends JavaIDE {

	public JCreatorJIDE(){
		description = "JCreator IDE";
	}
	
	@Override
	public String start() {
		return "Starting " + description;
	}
}
