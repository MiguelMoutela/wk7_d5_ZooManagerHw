package codeclan.com.zoomanagerhw.Enclosures;

import java.util.ArrayList;

import codeclan.com.zoomanagerhw.Animals.Animal;
import codeclan.com.zoomanagerhw.Animals.Monkey;

/**
 * Created by user on 10/11/2017.
 */

public class Enclosure<T extends Animal> {
    private ArrayList<T>enclosure;

    public Enclosure() {
            this.enclosure = new ArrayList();
        }

    public int getSize() {
        return enclosure.size();
    }
    public void addAnimal(T animal) {
        enclosure.add(animal);
    }
    public void removeAnimal(T animal) {
        enclosure.remove(animal);
    }

    public float getTotalCageValue() {
        float totalCageValue = 0;
        for (T animal : enclosure) {
            totalCageValue += animal.getCashValue();
        }
        return totalCageValue;
    }

    public ArrayList getAnimals() {
        return enclosure;
    }

    public boolean confirmAnimalType(Animal animal) {
        return enclosure.contains(animal);
    }
}
