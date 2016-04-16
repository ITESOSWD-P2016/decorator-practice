package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.plugin.Plugins;

public class GitHubPlugin extends Plugins{
	JavaIDE oJavaIDE;

	public GitHubPlugin(JavaIDE oJavaIDE) {
		this.oJavaIDE = oJavaIDE;
	}

    @Override
    public String getDescription() {
        return oJavaIDE.getDescription() + " with GitHub plugin";
    }
	
	@Override
	public String start() {
		return "Starting " + oJavaIDE.getDescription();
	}
}
