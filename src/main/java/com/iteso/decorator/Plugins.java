package com.iteso.decorator;

/**
 * Created by Sebastian on 15/04/16.
 */
public abstract class Plugins extends JavaIDE{
    public String description = "Plugins";

    public String getDescription(){
        return description;
    }
    public abstract String start();
}
