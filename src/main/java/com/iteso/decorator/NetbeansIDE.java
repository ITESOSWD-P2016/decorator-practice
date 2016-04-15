package com.iteso.decorator;

import com.iteso.decorator.JavaIDE;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class NetbeansIDE extends JavaIDE{
    public NetbeansIDE(){
        description = " Netbeans";
    }
    @Override
    public String start() {
        return "started";
    }
}
