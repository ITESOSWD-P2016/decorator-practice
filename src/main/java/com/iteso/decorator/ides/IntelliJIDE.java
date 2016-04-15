package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class IntelliJIDE extends JavaIDE {
	
	public IntelliJIDE(){
		description = "IntelliJ IDE";
	}
	
	@Override
	public String start() {
		return "Starting " + description;
	}
}
