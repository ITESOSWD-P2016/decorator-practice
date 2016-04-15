package com.iteso.decorator.plugins;

import com.iteso.decorator.Plugins;
import com.iteso.decorator.JavaIDE;
/**
 * Created by alexabeas on 4/15/16.
 */
public class DatabasePlugin extends Plugins {
    JavaIDE javaide;

    public DatabasePlugin (JavaIDE javaide){
        this.javaide = javaide;
    }

    @Override
    public String getDescription() {
        return javaide.getDescription() + " with DatabasePlugin ";
    }

    @Override
    public String start() {
        return "starting" + javaide.getDescription();
    }
}
