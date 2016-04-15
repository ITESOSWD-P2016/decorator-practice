package com.iteso.decorator.plugins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.PluginsDecorator;

/**
 * Created by luis_ on 15/04/2016.
 */
public class Python extends PluginsDecorator {
    JavaIDE ide;
    public Python(JavaIDE ide){this.ide = ide;}

    @Override
    public String start() {
        return ide.start()+ getDescription();
    }

    @Override
    public String getDescription() {
        return ide.getDescription() + " con Python";
    }
}
