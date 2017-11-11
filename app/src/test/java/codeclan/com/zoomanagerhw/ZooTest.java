package codeclan.com.zoomanagerhw;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import codeclan.com.zoomanagerhw.Animals.Elephant;
import codeclan.com.zoomanagerhw.Animals.Monkey;
import codeclan.com.zoomanagerhw.Enclosures.Enclosure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {

    Zoo centralZoo;
    Monkey monkey;
    Enclosure monkeyCage;
    Enclosure elephantPit;
    Elephant elephant;

    @Before
    public void before() {
        monkeyCage = new Enclosure<Monkey>();
        elephantPit = new Enclosure<Elephant>();
//        centralZoo = new ArrayList<ArrayList<monkeyCage>()ArrayList<elephantPit>()>();
        monkey = new Monkey("Bibi", 10);
        elephant = new Elephant("Alastair", 20);
    }

    @Test
    public void zooHasNoAnimals() {
        assertEquals(0, centralZoo.getNumberOfAnimals());
    }

    @Test
    public void zooHasNoFunds() {
        assertEquals(0, centralZoo.getFunds(), 0.01);
    }

    @Test
    public void zooHasFundsAndCanAddFunds() {
        centralZoo.addFunds(100);
        assertEquals(100, centralZoo.getFunds(), 0.01);
    }

    @Test
    public void zooCanRemoveFunds() {
        centralZoo.addFunds(100);
        centralZoo.removeFunds(100);
        assertEquals(0, centralZoo.getFunds(), 0.01);
    }
    // goodbye encapsulation? Please ask an instructor
    // same as the bear and the journal
    @Test
    public void zooCanGetAnimals() {
         assertNotNull(monkeyCage.getAnimals());
    }
//    @Test
//    public void zooCanSellAnimalTakingIntoAccountDifferentEnclosures() {
//        monkeyCage.addAnimal(monkey);
//        centralZoo.sellAnimalTakingIntoAccountDifferentEnclosures(monkey);
//        assertEquals(10, centralZoo.getFunds(), 0.01);
//        assertEquals(0, centralZoo.getNumberOfAnimals());
//    }
//
//    @Test
//    public void zooCanSellAnimalWithoutTakingIntoAccountDifferentEnclosures() {
//        monkeyCage.addAnimal(monkey);
//        centralZoo.sellAnimal(monkey);
//        assertEquals(10, centralZoo.getFunds(), 0.01);
//        assertEquals(0, centralZoo.getNumberOfAnimals());
//    }

//    @Test
//    public void zooCanGetTotalValueOfAllEnclosures() {
//        monkeyCage.addAnimal(monkey);
//        elephantPit.addAnimal(elephant);
//        assertEquals(2, centralZoo.getNumberOfAnimals());
//        assertEquals(30, centralZoo.getTotalAnimalCashValue());
//    }
}
