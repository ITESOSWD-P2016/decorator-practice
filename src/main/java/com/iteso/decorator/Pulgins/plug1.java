package com.iteso.decorator.Pulgins;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.ides.PLUGIN;

/**
 * Created by Flaveyro´sDell on 15/04/2016.
 */
public class plug1 extends PLUGIN{

        JavaIDE javaIDE;

    public plug1 (JavaIDE javaIDE){
        this.javaIDE = javaIDE;
    }

    public String getDescription(){
        return javaIDE.getDescription()+"plug1";
    }

    public String start(){
        return javaIDE.start()+ getDescription();
    }


}
