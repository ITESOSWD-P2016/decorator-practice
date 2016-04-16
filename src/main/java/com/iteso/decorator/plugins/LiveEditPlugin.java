package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.plugin.Plugins;

public class LiveEditPlugin extends Plugins {
	JavaIDE oJavaIDE;

	public LiveEditPlugin(JavaIDE oJavaIDE) {
		this.oJavaIDE = oJavaIDE;
	}

    @Override
    public String getDescription() {
        return oJavaIDE.getDescription() + " with LiveEdit plugin";
    }
	
	@Override
	public String start() {
		return "Starting " + oJavaIDE.getDescription();
	}
}
