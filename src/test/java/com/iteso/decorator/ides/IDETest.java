package com.iteso.decorator.ides;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.iteso.decorator.JavaIDE;

public class IDETest {
	JavaIDE oJavaIDE;

    @Test
    public void testEclipseIDE(){
    	oJavaIDE = new EclipseJIDE();
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE");
    }
    
    @Test
    public void testStartEclipseIDE(){
    	oJavaIDE = new EclipseJIDE();
        assertEquals(oJavaIDE.start(), "Starting Eclipse IDE");
    }
    
    @Test
    public void testIntelliJIDE(){
    	oJavaIDE = new IntelliJIDE();
        assertEquals(oJavaIDE.getDescription(), "IntelliJ IDE");
    }
    
    @Test
    public void testStartIntelliJIDE(){
    	oJavaIDE = new IntelliJIDE();
        assertEquals(oJavaIDE.start(), "Starting IntelliJ IDE");
    }
    
    @Test
    public void testJCreatorIDE(){
    	oJavaIDE = new JCreatorJIDE();
        assertEquals(oJavaIDE.getDescription(), "JCreator IDE");
    }
    
    @Test
    public void testStartJCreatorIDE(){
    	oJavaIDE = new JCreatorJIDE();
        assertEquals(oJavaIDE.start(), "Starting JCreator IDE");
    }
    
    @Test
    public void testNetbeansIDE(){
    	oJavaIDE = new NetbeansJIDE();
        assertEquals(oJavaIDE.getDescription(), "Netbeans IDE");
    }
    
    @Test
    public void testStartNetbeansIDE(){
    	oJavaIDE = new NetbeansJIDE();
        assertEquals(oJavaIDE.start(), "Starting Netbeans IDE");
    }
}
