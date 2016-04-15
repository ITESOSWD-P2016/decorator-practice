package com.iteso.decorator;

import com.iteso.decorator.JavaIDE;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class IntelliJIDE extends JavaIDE{
    public IntelliJIDE(){
        description = " Intellij";
    }
    @Override
    public String start() {
        return "starting"+getDescription();
    }
}
