package com.iteso.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class JavaIDE {
    public String description;

    public String getDescription(){
        return description;
    }
    
    public abstract String start();
}
