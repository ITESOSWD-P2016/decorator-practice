package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by Sabino on 15/04/2016.
 */
public class AudifonoIDE extends JavaIDE {

    public AudifonoIDE(){
        description = "AudifonoIDE ";
    }

    @Override
    public String start() {
        return "AudifonoIDE started ";
    }
}
