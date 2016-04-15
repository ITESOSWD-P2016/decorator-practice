package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by ChaosInfinityViral on 15/04/16.
 */
public class Xcode extends JavaIDE{
    public String description = "Xode";
    @Override
    public String start() {
        return "started Xcode";
    }
}
