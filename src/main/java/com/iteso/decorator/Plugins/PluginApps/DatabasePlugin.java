package com.iteso.decorator.Plugins.PluginApps;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.Plugins.Plugin;

/**
 * Created by ChaosInfinityViral on 15/04/16.
 */
public class DatabasePlugin extends Plugin {
    JavaIDE javaIDE;
    public DatabasePlugin (JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + " Data base connector";
    }

    @Override
    public String start() {
        return javaIDE.start()+ getDescription();
    }


}
