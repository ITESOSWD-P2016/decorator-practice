package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.plugin.Plugins;

public class DataBaseNavigatorPlugin extends Plugins {
	JavaIDE oJavaIDE;

	public DataBaseNavigatorPlugin(JavaIDE oJavaIDE) {
		this.oJavaIDE = oJavaIDE;
	}

    @Override
    public String getDescription() {
        return oJavaIDE.getDescription() + " with DataBaseNavitagor plugin";
    }
	
	@Override
	public String start() {
		return "Starting " + oJavaIDE.getDescription();
	}
}
