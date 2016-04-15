package com.iteso.decorator.plugIns;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.PlugIn;

/**
 * Created by Sabino on 15/04/2016.
 */
public class UltraEruposPlugIn extends PlugIn{
    JavaIDE javaIDE;

    public UltraEruposPlugIn(JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + "con UltraEruposPlugIn ";
    }

    @Override
    public String start() {
        return javaIDE.start() + getDescription();
    }
}
