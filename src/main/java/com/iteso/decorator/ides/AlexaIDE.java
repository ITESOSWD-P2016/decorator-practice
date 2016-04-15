package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by alexabeas on 4/15/16.
 */
public class AlexaIDE extends JavaIDE {

    public String description = "AlexaIDE";

    @Override
    public String start() {
        return "AlexaIDE started";
    }
}
