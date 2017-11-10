package codeclan.com.zoomanagerhw;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.zoomanagerhw.Animals.Elephant;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ElephantTest {

    Elephant elephant;

    @Before
    public void before() {
        elephant = new Elephant("Dumbo", 10);
    }
    @Test
    public void animalHasName() {
        assertEquals("Dumbo", elephant.getName());
    }
    @Test
    public void animalHasCashValue() {
        assertEquals(10, elephant.getCashValue(),0.01);
    }
}
