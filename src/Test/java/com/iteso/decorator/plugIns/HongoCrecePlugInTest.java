package com.iteso.decorator.plugIns;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.ides.NiñoIDE;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sabino on 15/04/2016.
 */
public class HongoCrecePlugInTest {
    JavaIDE javaIDE;
    @Before
    public void setUp(){
        javaIDE = new NiñoIDE();
        javaIDE = new HongoCrecePlugIn(javaIDE);
    }

    @Test
    public void Niño4BrazosPlugInDescriptionTest(){

        assertEquals("NiñoIDE con HongoCrecePlugIn",javaIDE.getDescription());
    }

    @Test
    public void Niño4BrazosPlugInInStartTest(){
        assertEquals("NiñoIDE started NiñoIDE con HongoCrecePlugIn",javaIDE.start());
    }

}
