package com.iteso.decorator;

import com.iteso.decorator.JavaIDE;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class AptanaStudioIDE extends JavaIDE{
    public AptanaStudioIDE(){
        description = " AptanaStudio";
    }
    @Override
    public String start() {
        return "starting";
    }
}
