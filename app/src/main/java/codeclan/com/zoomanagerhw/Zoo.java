package codeclan.com.zoomanagerhw;

import java.util.ArrayList;

import codeclan.com.zoomanagerhw.Animals.*;
import codeclan.com.zoomanagerhw.Animals.Animal;
import codeclan.com.zoomanagerhw.Enclosures.Enclosure;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure>enclosures;
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

    public void addEnclosure(Enclosure animalEnclosure) {
        enclosures.add(animalEnclosure);
    }

    //sellAnimal should probably have a
    //an else {return string}

    //assertE

    public void sellAnimalTakingIntoAccountDifferentEnclosures(Animal animal) {

        for (Enclosure animalsEnclosure : enclosures) {
            if (animalsEnclosure.confirmAnimalType(animal) == true) {
                animalsEnclosure.removeAnimal(animal);
                this.funds += animal.getCashValue();
                // need to break here otherwise
                // I will sell all the monkeys
                break;
            }
            // what a good opportunity to throw
            // an exception
            // if I cannot find the animal type
        }
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

    public int getNumberOfAnimals() {
        int total = 0;
        for(Enclosure enclosure : this.enclosures) {
            total += enclosure.getSize();
        }
        return total;
    }

    public float getTotalAnimalCashValue() {
        float totalAnimalCashValue = 0;
        for (Enclosure animalsEnclosure : enclosures) {
            ArrayList<Animal> aTempAnimalArray = animalsEnclosure.getAnimals();
            for (Animal animal : aTempAnimalArray) {
                totalAnimalCashValue += animal.getCashValue();
            }
        }
        return totalAnimalCashValue;
    }

    public boolean checkThereIsRoom() {
        boolean thereIsRoom = false;
        for (int index = 0; index < visitors.length; index++)
            if (visitors[index] == null) {
                thereIsRoom = true;
            }
        return thereIsRoom;
    }

    public String addVisitor(Visitor visitor) {

        for (int index = 0; index < visitors.length; index++) {
            if (visitors[index] == null) {
                visitors[index] = visitor;
                chargeTicket(visitor);
                // what a good opportunity
                // to throw an exception
                // if visitor does not have
                // enough funds
                return "Come on in";
            }
        }
        return "Please wait in line";
      // what a good opportunity to throw
      // an exception if zoo is full
    }
}




