package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by User on 15/04/2016.
 */
public class Eclipse extends JavaIDE {

    public String description = "Eclipse";

    @Override
    public String start() {
        return "started Eclipse";
    }
}
