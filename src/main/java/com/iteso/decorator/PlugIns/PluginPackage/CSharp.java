package com.iteso.decorator.PlugIns.PluginPackage;
import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.PlugIns.PluginDecorator;

/**
 * Created by to_r_ on 4/15/2016.
 */
public class CSharp extends PluginDecorator{
    JavaIDE JavaIDE;
    public CSharp ( JavaIDE JavaIDE){
        this.JavaIDE = JavaIDE;
    }
    @Override
    public String getDescription() {
        return JavaIDE.getDescription() + "with CSharp";
    }

    @Override
    public String start() {
        return JavaIDE.start() + " CSharp started";
    }
}