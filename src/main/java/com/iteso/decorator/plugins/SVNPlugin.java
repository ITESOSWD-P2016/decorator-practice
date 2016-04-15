package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.plugin.Plugins;

public class SVNPlugin extends Plugins {
	JavaIDE oJavaIDE;

	public SVNPlugin(JavaIDE oJavaIDE) {
		this.oJavaIDE = oJavaIDE;
	}

    @Override
    public String getDescription() {
        return oJavaIDE.getDescription() + " with SVN plugin";
    }
	
	@Override
	public String start() {
		return "starting: " + oJavaIDE.getDescription();
	}
}
