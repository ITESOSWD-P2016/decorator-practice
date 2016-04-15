package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;
import  com.iteso.decorator.PlugIns.PluginPackage.MavenPlugin;
import  com.iteso.decorator.PlugIns.PluginPackage.CPlugin;
/**
 * Created by to_r_ on 4/15/2016.
 */
public class TuIde {
    public static void main(String[] args) {
        JavaIDE ide = new IntelliJIDE();

        System.out.println(ide.getDescription());
        System.out.println("Starting:" + ide.start() + ". Start process finished");

    }
}
