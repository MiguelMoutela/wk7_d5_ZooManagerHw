package codeclan.com.zoomanagerhw;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.zoomanagerhw.Animals.Monkey;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {

    Zoo centralZoo;
    Monkey monkey;

    @Before
    public void before() {
        centralZoo = new Zoo();
        monkey = new Monkey("Bibi", 10);
    }
    @Test public void zooHasNoAnimals() {
        assertEquals(0, centralZoo.getNumberOfAnimals());
    }

    @Test public void zooCanAddAnimals() {
        centralZoo.addAnimal(monkey);
        centralZoo.addAnimal(monkey);
        centralZoo.addAnimal(2);

        assertEquals(3, centralZoo.getNumberOfAnimals());
    }
    @Test public void zooCanRemoveAnimals() {
        centralZoo.addAnimal(monkey);
        centralZoo.removeAnimal(monkey);
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
        centralZoo.addAnimal(monkey);
        centralZoo.sellAnimal(monkey);
        assertEquals(10, centralZoo.getFunds(),0.01);
    }
//    @Test public void
}
