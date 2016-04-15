package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.Plugins;

/**
 * Created by Sebastian on 15/04/16.
 */
public class Groovy extends Plugins {
    JavaIDE javaide;
    public Groovy (JavaIDE javaide) {this.javaide = javaide;}

    @Override
    public String getDescription() {
        return javaide.getDescription() + "with Groovy Plugin";
    }
    public String start() {
        return "Starting" + javaide.getDescription();
    }

}