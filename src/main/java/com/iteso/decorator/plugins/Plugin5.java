package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.ides.Plugin;

/**
 * Created by User on 15/04/2016.
 */
public class Plugin5 extends Plugin {
    JavaIDE javaIDE;

    public Plugin5 (JavaIDE javaIDE) {
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + " Plugin5";
    }

    @Override
    public String start() {
        return javaIDE.start() + getDescription();
    }
}
