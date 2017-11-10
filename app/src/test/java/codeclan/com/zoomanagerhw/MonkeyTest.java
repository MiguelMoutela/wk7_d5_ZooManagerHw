package codeclan.com.zoomanagerhw;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.zoomanagerhw.Animals.Monkey;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class MonkeyTest {

    Monkey monkey;

    @Before
    public void before() {
        monkey = new Monkey("Bibi", 10);
    }
    @Test
    public void animalHasName() {
        assertEquals("Bibi", monkey.getName());
    }
    @Test
    public void animalHasCashValue() {
        assertEquals(10, monkey.getCashValue(),0.01);
    }


}
