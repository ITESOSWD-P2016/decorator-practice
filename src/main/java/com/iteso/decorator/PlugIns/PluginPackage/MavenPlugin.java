package com.iteso.decorator.PlugIns.PluginPackage;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.PlugIns.PluginDecorator;

/**
 * Created by to_r_ on 4/15/2016.
 */
public class MavenPlugin extends PluginDecorator{
    JavaIDE JavaIDE;
    public MavenPlugin ( JavaIDE JavaIDE){
        this.JavaIDE = JavaIDE;
    }
    @Override
    public String getDescription() {
        return JavaIDE.getDescription() + "with Maven";
    }

    @Override
    public String start() {
        return JavaIDE.start() + " Maven started";
    }
}
