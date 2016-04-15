package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.Plugins;

/**
 * Created by alexabeas on 4/15/16.
 */
public class GitPlugin extends Plugins {

    JavaIDE javaide;

    public GitPlugin (JavaIDE javaide){
        this.javaide = javaide;
    }

    @Override
    public String getDescription() {
        return javaide.getDescription() + " with GitPlugin ";
    }
    @Override
    public String start() {
        return "starting" + javaide.getDescription();
    }
}
