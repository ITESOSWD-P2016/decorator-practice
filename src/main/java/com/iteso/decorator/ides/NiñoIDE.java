package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by Sabino on 15/04/2016.
 */
public class NiñoIDE extends JavaIDE {

    public NiñoIDE(){
        description = "NiñoIDE ";
    }

    @Override
    public String start() {
        return "NiñoIDE started ";
    }
}
