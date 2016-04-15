package com.iteso.decorator.plugIns;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.PlugIn;

/**
 * Created by Sabino on 15/04/2016.
 */
public class HongoCrecePlugIn extends PlugIn{
    JavaIDE javaIDE;

    public HongoCrecePlugIn(JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + "con HongoCrecePlugIn";
    }

    @Override
    public String start() {
        return javaIDE.start() + getDescription();
    }
}
