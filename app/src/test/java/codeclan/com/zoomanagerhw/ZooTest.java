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
        centralZoo = new Zoo();
        monkey = new Monkey("Bibi", 10);
        elephant = new Elephant("Alastair", 20);
    }

    @Test
    public void zooHasNoEnclosures() {
        assertEquals(0, centralZoo.getNumberOfEnclosures());
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
    @Test
    public void zooCanGetTicketPrice() {
        centralZoo.getTicketPrice();
    }

    // goodbye encapsulation? Please ask an instructor
    // I am simply handing my array to another class
    // AssertNotNull passing
    // I have the other assertion just to show me that I am
    // receiving an array of monkey objects.
    @Test
    public void zooCanGetAnimals() {
        monkeyCage.addAnimal((monkey));
//        assertEquals(monkey, monkeyCage.getAnimals());
        assertNotNull(monkeyCage.getAnimals());
    }
    @Test
    public void zooCanAddAnAnimalEnclosureToEnclosures() {
        monkeyCage.addAnimal(monkey);
        centralZoo.addEnclosure(monkeyCage.getAnimals());
        assertEquals(1, centralZoo.getNumberOfEnclosures());
    }
    @Test
    public void zooCanSellAnimalTakingIntoAccountDifferentEnclosures() {
        monkeyCage.addAnimal(monkey);
        centralZoo.addEnclosure(monkeyCage.getAnimals());
        centralZoo.sellAnimalTakingIntoAccountDifferentEnclosures(monkey);
        assertEquals(10, centralZoo.getFunds(), 0.01);
    }
//
//    @Test
//    public void zooCanSellAnimalWithoutTakingIntoAccountDifferentEnclosures() {
//        monkeyCage.addAnimal(monkey);
//        centralZoo.sellAnimal(monkey);
//        assertEquals(10, centralZoo.getFunds(), 0.01);
//        assertEquals(0, centralZoo.getNumberOfAnimals());
//    }

    @Test
    public void zooCanGetTotalValueOfAllEnclosures() {
        monkeyCage.addAnimal(monkey);
        elephantPit.addAnimal(elephant);
        centralZoo.addEnclosure(monkeyCage.getAnimals());
        centralZoo.addEnclosure(elephantPit.getAnimals());
        assertEquals(2, centralZoo.getNumberOfEnclosures());
//        assertEquals(30, centralZoo.getTotalAnimalCashValue());
    }
}
