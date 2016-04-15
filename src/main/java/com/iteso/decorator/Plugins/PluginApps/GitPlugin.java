package com.iteso.decorator.Plugins.PluginApps;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.Plugins.Plugin;

/**
 * Created by ChaosInfinityViral on 15/04/16.
 */
public class GitPlugin extends Plugin {

    JavaIDE javaIDE;
    public GitPlugin (JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + " Git stuff";
    }

    @Override
    public String start() {
        return javaIDE.start()+ getDescription();
    }
}
