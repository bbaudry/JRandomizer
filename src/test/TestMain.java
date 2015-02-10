package test;

import junit.framework.TestCase;
import main.Navigator;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by bbaudry on 09/02/2015.
 */
public class TestMain extends TestCase {

    @Test
    public void testGetAttributes() {
        Navigator navigator = new Navigator("www.gong.edu", "Gong", 2);
        assertEquals(3, navigator.getAttributes().size());
        assertTrue(navigator.getAttributes().contains((String) "www.gong.edu"));
        assertTrue(navigator.getAttributes().contains((String) "Gong"));
        assertTrue(navigator.getAttributes().contains((int) 2));
        for (int i = 0; i < 100000; i++) {
            Iterator it = navigator.getAttributes().iterator();
            assertEquals((int) 2, it.next());
            assertEquals((String) "Gong", it.next());
            assertEquals((String) "www.gong.edu", it.next());
        }

    }


}
