package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by alexabeas on 4/15/16.
 */
public class EclipseIDE extends JavaIDE {

    public String description = "EclipseIDE";

    @Override
    public String start() {
        return "EclipseIDE started";
    }
}
