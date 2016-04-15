package com.iteso.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luis_ on 15/04/2016.
 */
public class IntelliJIDETest {
    @Test
    public void teststartIntelliJ() {
        JavaIDE id = new IntelliJIDE();
        assertEquals("starting Intellij", id.start());
    }

}
