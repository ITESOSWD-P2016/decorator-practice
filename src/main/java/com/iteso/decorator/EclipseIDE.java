package com.iteso.decorator;

import com.iteso.decorator.JavaIDE;

/**
 * Created by luis_ on 15/04/2016.
 */
public class EclipseIDE extends JavaIDE {
    public EclipseIDE(){
        description = " Eclipse";
    }
    @Override
    public String start() {
        return "started";
    }
}
