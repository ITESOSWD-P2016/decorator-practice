package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class VisualCommunityIDE extends JavaIDE{
    public String description = "Visual IDE ";
    @Override
    public String start() {
        return "Visual Community IDE started";
    }
}
