package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by alexabeas on 4/15/16.
 */
public class NetbeansIDE extends JavaIDE {

    public String description = "NetbeansIDE";

    @Override
    public String start() {
        return "NetbeansIDE started";
    }
}
