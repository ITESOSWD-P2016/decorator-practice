package com.iteso.decorator.ides;

import com.iteso.decorator.JavaIDE;
import  com.iteso.decorator.PlugIns.PluginPackage.CPlugin;
import  com.iteso.decorator.PlugIns.PluginPackage.CSharp;
import  com.iteso.decorator.PlugIns.PluginPackage.MavenPlugin;
import  com.iteso.decorator.PlugIns.PluginPackage.ObjectiveC;
import  com.iteso.decorator.PlugIns.PluginPackage.SkinPlugin;
/**
 * Created by to_r_ on 4/15/2016.
 */
public class TuIde {
    public static void main(String[] args) {
        JavaIDE ide = new CodeBlocksIde();
        ide = new CPlugin(ide);
        ide = new CSharp(ide);
        ide = new SkinPlugin(ide);
        ide = new MavenPlugin(ide);
        ide = new ObjectiveC(ide);
        System.out.println(ide.getDescription());
        System.out.println("Starting:" + ide.start() + ". Start process finished");

    }
}
