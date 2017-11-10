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

    public void addAnimal(T animal) {
        this.enclosures.add(animal);
    }

    public void removeAnimal(T animal) {
        this.enclosures.remove(animal);
    }

    public void addFunds(float money) {
        this.funds += money;
    }

    public void removeFunds(float money) {
        this.funds -= money;
    }

    public void sellAnimal(Animal animal) {
        enclosures.remove(animal);
        this.funds += animal.getCashValue();
    }
}
