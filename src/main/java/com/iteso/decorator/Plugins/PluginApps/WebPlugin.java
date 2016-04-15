package com.iteso.decorator.Plugins.PluginApps;

import com.iteso.decorator.JavaIDE;

/**
 * Created by ChaosInfinityViral on 15/04/16.
 */
public class WebPlugin extends JavaIDE{
    JavaIDE javaIDE;
    public WebPlugin (JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + " Web stuff";
    }

    @Override
    public String start() {
        return javaIDE.start()+ getDescription();
    }
}
