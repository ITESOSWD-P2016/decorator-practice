package com.iteso.decorator.plugins;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.ides.EclipseJIDE;

public class LiveEditPluginTest {
	JavaIDE oJavaIDE;
	
	@Before
	public void setUp(){
		oJavaIDE = new EclipseJIDE();
	}

    @Test
    public void testDataBaseNavigatorPlugin(){
    	oJavaIDE = new DataBaseNavigatorPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with DataBaseNavitagor plugin");
    }
    
    @Test
    public void testGitHubPlugin(){
    	oJavaIDE = new GitHubPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with GitHub plugin");
    }
    
    @Test
    public void testHTMLEditorPlugin(){
    	oJavaIDE = new HTMLEditorPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with HTMLEditor plugin");
    }
    
    @Test
    public void testLiveEditPlugin(){
    	oJavaIDE = new LiveEditPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with LiveEdit plugin");
    }
    
    @Test
    public void testSVNPlugin(){
    	oJavaIDE = new SVNPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with SVN plugin");
    }
    
    @Test
    public void testDataBaseNavigatorPluginAndGitHubPlugin(){
    	oJavaIDE = new DataBaseNavigatorPlugin(oJavaIDE);
    	oJavaIDE = new GitHubPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with DataBaseNavitagor plugin with GitHub plugin");
    }
    
    @Test
    public void testDataBaseNavigatorPluginAndGitHubPluginAndHTMLEditorPlugin(){
    	oJavaIDE = new DataBaseNavigatorPlugin(oJavaIDE);
    	oJavaIDE = new GitHubPlugin(oJavaIDE);
    	oJavaIDE = new HTMLEditorPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with DataBaseNavitagor plugin with GitHub plugin with HTMLEditor plugin");
    }
    
    @Test
    public void testLiveEditPluginAndSVNPlugin(){
    	oJavaIDE = new LiveEditPlugin(oJavaIDE);
    	oJavaIDE = new SVNPlugin(oJavaIDE);
        assertEquals(oJavaIDE.getDescription(), "Eclipse IDE with LiveEdit plugin with SVN plugin");
    }

}
