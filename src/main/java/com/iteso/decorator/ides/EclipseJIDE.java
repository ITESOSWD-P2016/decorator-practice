package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

public class EclipseJIDE extends JavaIDE {
	
	public EclipseJIDE(){
		description = "Eclipse IDE";
	}
	
	@Override
	public String start() {
		return "Starting " + description;
	}

}
