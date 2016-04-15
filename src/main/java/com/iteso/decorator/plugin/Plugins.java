package com.iteso.decorator.plugin;

import com.iteso.decorator.JavaIDE;

public abstract class Plugins extends JavaIDE {
	
	public String start (JavaIDE oJavaIDE){
		return description;
	}
}
