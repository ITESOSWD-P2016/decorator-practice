package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class IntelliJIDE extends JavaIDE{
    public String description = "Intellij IDE ";
    @Override
    public String start() {
        return "Java IDE started";
    }
}
