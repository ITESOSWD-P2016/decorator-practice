package com.iteso.decorator.ides;
import com.iteso.decorator.JavaIDE;
/**
 * Created by to_r_ on 4/15/2016.
 */
public class EclipseIDE extends JavaIDE{
    public String description = "Eclipse IDE";
    @Override
    public String start() {
        return "Eclipse IDE started";
    }
}
