package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by User on 15/04/2016.
 */
public class Notepad extends JavaIDE {

    public String description = "Notepad";

    @Override
    public String start() {
        return "started Notepad";
    }
}
