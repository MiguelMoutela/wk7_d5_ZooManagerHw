package codeclan.com.zoomanagerhw;

import java.util.ArrayList;

import codeclan.com.zoomanagerhw.Animals.*;
import codeclan.com.zoomanagerhw.Animals.Animal;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo<T> {
    private ArrayList<T>enclosures;
    private float funds;

    public Zoo(){
        this.enclosures = new ArrayList<T>();
        this.funds = funds;
    }

    public int getNumberOfAnimals() {
        return this.enclosures.size();
    }

    public float getFunds() {
        return this.funds;
    }


    public void addFunds(float money) {
        this.funds += money;
    }

    public void removeFunds(float money) {
        this.funds -= money;
    }

//    sellAnimal should probably have a
    //an else{ return string}

//Why can I only call contain() on enclosures but not enclosure?!?!?
//Why can I not access my methods of the enclosure class??!??!?
    public void sellAnimalTakingIntoAccountDifferentEnclosures(Animal animal) {

        for (T enclosure : enclosures) {
            if (enclosure.contains(animal)) {
                enclosure.removeAnimal(animal);
                this.funds += animal.getCashValue();
            }
        }
    }
//Was working but not anymore
//Should have never have worked in the first place?
    public void sellAnimal(Animal animal) {
        enclosures.remove(animal);
        this.funds += animal.getCashValue();
    }
// Not running properly
// does not like the second loop
    public float getTotalAnimalCashValue() {
        float totalAnimalCashValue = 0;
        for (T enclosure : enclosures) {
            for (Animal animal : enclosure) {
                totalAnimalCashValue += animal.getCashValue();
            }
        }
        return totalAnimalCashValue;
    }
}
