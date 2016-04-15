package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;

/**
 * Created by Sabino on 15/04/2016.
 */
public class RefrescoIDE extends JavaIDE{
    public RefrescoIDE(){
        description = "RefrescoIDE ";
    }

    @Override
    public String start() {
        return "RefrescoIDE started ";
    }
}
