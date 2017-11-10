package codeclan.com.zoomanagerhw;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import codeclan.com.zoomanagerhw.Animals.Monkey;
import codeclan.com.zoomanagerhw.Enclosures.Enclosure;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class EnclosureTest {

    Enclosure monkeyCage;
    Monkey monkey;

    @Before
    public void before() {
        monkeyCage = new Enclosure<Monkey>();
        monkey = new Monkey("Bibi", 10);
        monkey = new Monkey("BibiToo", 10);
    }
    @Test
    public void cageHasNoAnimal() {
        assertEquals(0, monkeyCage.getSize());
    }
    @Test
    public void canAddAnimal() {
        monkeyCage.addAnimal(monkey);
        assertEquals(1, monkeyCage.getSize());
    }
    @Test
    public void canRemoveAnimal() {
        monkeyCage.addAnimal(monkey);
        monkeyCage.removeAnimal(monkey);
        assertEquals(0, monkeyCage.getSize());
    }
    @Test
    public void canGetNumberOfAnimalInCage() {
        monkeyCage.addAnimal(monkey);
        monkeyCage.addAnimal(monkey);
        assertEquals(2, monkeyCage.getSize());
    }
    @Test
    public void canGetTotalAnimalCageValue() {
        monkeyCage.addAnimal(monkey);
        monkeyCage.addAnimal(monkey);
        assertEquals(20, monkeyCage.getTotalCageValue(),0.01);}
}
