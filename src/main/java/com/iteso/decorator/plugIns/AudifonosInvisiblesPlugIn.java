package com.iteso.decorator.plugIns;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.PlugIn;
import sun.plugin2.applet.Plugin2BasicService;

/**
 * Created by Sabino on 15/04/2016.
 */
public class AudifonosInvisiblesPlugIn extends PlugIn {
    JavaIDE javaIDE;

    public AudifonosInvisiblesPlugIn(JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    @Override
    public String getDescription() {
        return javaIDE.getDescription() + "con AudifonosInvisiblesPlugIn";
    }

    @Override
    public String start() {
        return javaIDE.start() + getDescription();
    }
}
