package codeclan.com.zoomanagerhw;

import java.util.ArrayList;

import codeclan.com.zoomanagerhw.Animals.*;
import codeclan.com.zoomanagerhw.Animals.Animal;
import codeclan.com.zoomanagerhw.Enclosures.Enclosure;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo<T> {
    private ArrayList<T>enclosures;
    private float funds;
    private float ticketPrice;
    private Visitor[] visitors;

    //fixed size array - cool things happening here.
    //I am afraid my Zoo is fairly small
    //it only takes 50 people
    //should throw an exception
    //when full
    //last index is 49

    public Zoo(){
        this.enclosures = new ArrayList<T>();
        //Is this composition?
        this.visitors = new Visitor[50];
        this.funds = funds;
        this.ticketPrice = ticketPrice;
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

    //sellAnimal should probably have a
    //an else {return string}

//Why can I only call contain() on enclosures but not enclosure?!?!?
//Why can I not access my methods of the enclosure class??!??!?
//    public void sellAnimalTakingIntoAccountDifferentEnclosures(Animal animal) {
//
//        for (T enclosure : enclosures) {
//            if (enclosure.contains(animal)) {
//                enclosure.removeAnimal(animal);
//                this.funds += animal.getCashValue();
//            }
//        }
//    }
//Was working but not anymore
//Should have never have worked in the first place?
    public void sellAnimal(Animal animal) {
        enclosures.remove(animal);
        this.funds += animal.getCashValue();
    }
// Not running properly
// does not like enclosure in the second loop

//    public float getTotalAnimalCashValue() {
//        float totalAnimalCashValue = 0;
//        for (T enclosure : enclosures) {
//            ArrayList animalArray = Enclosure.getAnimals();
//            for (Animal animal : animalArray) {
//                totalAnimalCashValue += animal.getCashValue();
//            }
//        }
//        return totalAnimalCashValue;
//    }

    public void addVisitor(Visitor visitor){}
    //this method needs to throw and exception
    // called FullArrayException
    // google what an array with a set size has
    // as a size "property and create an exception
    //logic:

    // boolean thereIsRoom = false;

    // for (int index = 0 < visitors.length; i++) {
    // if (visitors[index] == null) {
    // thereIsRoom = true;
    // visitors.AddVisitor(visitor);
    // }

    //else (!thereIsRoom)
    // throw exception
    // {Sout "Zoo is at capacity, please wait in line"}
    //
}
