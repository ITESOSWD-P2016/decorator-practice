import com.iteso.decorator.JavaIDE;
import com.iteso.decorator.ides.IntelliJIDE;
import com.iteso.decorator.plugIns.MasColorcitosPlugIn;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 * Created by Sabino on 15/04/2016.
 */
public class MasColorcitosPlugInTest {
    JavaIDE javaIDE;
    @Before
    public void setUp(){
        javaIDE = new IntelliJIDE();
        javaIDE = new MasColorcitosPlugIn(javaIDE);
    }

    @Test
    public void MasColorcitosPlugInDescriptionTest(){

        assertEquals("IntelliJIDE con MasColorcitosPlugIn",javaIDE.getDescription());
    }

    @Test
    public void MasColorcitosPlugInStartTest(){
        assertEquals("IntelliJIDE started IntelliJIDE con MasColorcitosPlugIn",javaIDE.start());
    }

}
