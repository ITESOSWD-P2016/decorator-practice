package com.iteso.decorator.plugIns;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.ides.AudifonoIDE;
import com.iteso.decorator.ides.RefrescoIDE;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sabino on 15/04/2016.
 */
public class UltrAudifonosInvisiblesPlugInTest {
    JavaIDE javaIDE;
    @Before
    public void setUp(){
        javaIDE = new AudifonoIDE();
        javaIDE = new AudifonosInvisiblesPlugIn(javaIDE);
    }

    @Test
    public void Niño4BrazosPlugInDescriptionTest(){

        assertEquals("AudifonoIDE con AudifonosInvisiblesPlugIn",javaIDE.getDescription());
    }

    @Test
    public void Niño4BrazosPlugInInStartTest(){
        assertEquals("AudifonoIDE started AudifonoIDE con AudifonosInvisiblesPlugIn",javaIDE.start());
    }

}
