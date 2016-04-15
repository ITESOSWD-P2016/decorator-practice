package com.iteso.decorator.plugIns;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.PlugIn;

/**
 * Created by Sabino on 15/04/2016.
 */
public class Niño4BrazosPlugIn extends PlugIn{
    JavaIDE javaIDE;

    public Niño4BrazosPlugIn(JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + "con Niño4BrazosPlugIn";
    }

    @Override
    public String start() {
        return javaIDE.start() + getDescription();
    }
}
