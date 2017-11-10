package codeclan.com.zoomanagerhw;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.zoomanagerhw.Animals.Monkey;
import codeclan.com.zoomanagerhw.Enclosures.Enclosure;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {

    Zoo centralZoo;
    Monkey monkey;
    Enclosure monkeyCage;

    @Before
    public void before() {
        centralZoo = new Zoo();
        monkey = new Monkey("Bibi", 10);
        monkeyCage = new Enclosure();
    }
    @Test public void zooHasNoAnimals() {
        assertEquals(0, centralZoo.getNumberOfAnimals());
    }
    @Test public void zooHasNoFunds() {
        assertEquals (0, centralZoo.getFunds(), 0.01);
    }
    @Test public void zooHasFundsAndCanAddFunds() {
        centralZoo.addFunds(100);
        assertEquals(100, centralZoo.getFunds(),0.01);
    }
    @Test public void zooCanRemoveFunds() {
        centralZoo.addFunds(100);
        centralZoo.removeFunds(100);
        assertEquals(0, centralZoo.getFunds(), 0.01);
    }
    @Test public void zooCanSellAnimal() {
        monkeyCage.addAnimal(monkey);
        centralZoo.sellAnimal(monkey);
        assertEquals(10, centralZoo.getFunds(),0.01);
        assertEquals(0, centralZoo.getNumberOfAnimals());
    }
}
