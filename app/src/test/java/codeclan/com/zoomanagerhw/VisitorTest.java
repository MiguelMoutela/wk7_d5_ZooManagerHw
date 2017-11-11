package codeclan.com.zoomanagerhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 11/11/2017.
 */

public class VisitorTest {
    Visitor visitor1;

    @Before
    public void before() {
        visitor1 = new Visitor("Xavier", 100);
    }
    @Test
    public void canGetName() {
        assertEquals("Xavier", visitor1.getName());
    }
    @Test
    public void canGetFunds() {
        assertEquals(100, visitor1.getFunds());
    }
    @Test
    public void canReduceFunds() {
        visitor1.reduceFunds(10);
        assertEquals(90, visitor1.getFunds(), 0.01);
    }
    @Test
    public void canIncreaseFunds() {
        visitor1.increaseFunds(10);
        assertEquals(110, visitor1.getFunds(), 0.01);
    }
}
