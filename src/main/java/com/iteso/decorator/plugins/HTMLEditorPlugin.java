package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.plugin.Plugins;

public class HTMLEditorPlugin extends Plugins{
	JavaIDE oJavaIDE;

	public HTMLEditorPlugin(JavaIDE oJavaIDE) {
		this.oJavaIDE = oJavaIDE;
	}

    @Override
    public String getDescription() {
        return oJavaIDE.getDescription() + " with HTMLEditor plugin";
    }
	
	@Override
	public String start() {
		return "starting: " + oJavaIDE.getDescription();
	}
}
