package com.iteso.decorator.plugIns;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.ides.NiñoIDE;
import com.iteso.decorator.ides.RefrescoIDE;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sabino on 15/04/2016.
 */
public class UltraEruptossPlugInTest {
    JavaIDE javaIDE;
    @Before
    public void setUp(){
        javaIDE = new RefrescoIDE();
        javaIDE = new UltraEruposPlugIn(javaIDE);
    }

    @Test
    public void Niño4BrazosPlugInDescriptionTest(){

        assertEquals("RefrescoIDE con UltraEruposPlugIn ",javaIDE.getDescription());
    }

    @Test
    public void Niño4BrazosPlugInInStartTest(){
        assertEquals("RefrescoIDE started RefrescoIDE con UltraEruposPlugIn ",javaIDE.start());
    }

}
