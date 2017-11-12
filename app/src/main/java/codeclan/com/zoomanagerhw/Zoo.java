package codeclan.com.zoomanagerhw;

import java.util.ArrayList;

import codeclan.com.zoomanagerhw.Animals.*;
import codeclan.com.zoomanagerhw.Animals.Animal;
import codeclan.com.zoomanagerhw.Enclosures.Enclosure;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure> enclosures;
    private float funds;
    private float ticketPrice;
    private Visitor[] visitors;

    //fixed size array - cool things happening here.
    //I am afraid my Zoo is fairly small
    //it only takes 50 people
    //should throw an exception
    //when full
    //last index is 49

    public Zoo() {
        this.enclosures = new ArrayList<>();
        //Is this composition?
        this.visitors = new Visitor[2];
        this.funds = funds;
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfEnclosures() {
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

    // New method here - addAll
    // Is this overkill?

    public void addEnclosure(ArrayList animalEnclosure) {
        enclosures.addAll(animalEnclosure);
    }

    //sellAnimal should probably have a
    //an else {return string}

    public String sellAnimalTakingIntoAccountDifferentEnclosures(Animal animal) {

        for (Enclosure animalsEnclosure : enclosures) {
            if (animalsEnclosure.confirmAnimalType(animal) == true) {
                animalsEnclosure.removeAnimal(animal);
                this.funds += animal.getCashValue();
                // need to return here otherwise
                // I will sell all the monkeys
            }
            break;
            // what a good opportunity for a catch all
            // if I cannot find the animal type
        }
        return "The Zoo does not have that animal in its enclosures";
    }

    public float getTicketPrice() {
        return this.ticketPrice;
    }

    public void chargeTicket(Visitor visitor) {
        visitor.reduceFunds(this.ticketPrice);
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
//     Not running properly
//     does not like enclosure in the second loop

//    public float getTotalAnimalCashValue() {
//        float totalAnimalCashValue = 0;
//        for (Enclosure animalsEnclosure : enclosures) {
//            ArrayList aTempAnimalArray = animalsEnclosure.getAnimals();
//            for (Animal animal : aTempAnimalArray) {
//                totalAnimalCashValue += animal.getCashValue();
//            }
//        }
//        return totalAnimalCashValue;
//    }
    //--------------------------------------------------------
    public boolean checkItsFull() {
        boolean thereIsRoom = false;
        for (int index = 0; index < visitors.length; index++);
            if (visitors[index] == null) {
                thereIsRoom = true;
            }
        return thereIsRoom;
    }
    public String addVisitor(Visitor visitor) {
      if (checkItsFull() == false) {
          visitors.add(visitor);
      } else if (checkItsFull() == true) {}
      return "Please wait in line";
    }
}
    //-------------------------------------------------------------




