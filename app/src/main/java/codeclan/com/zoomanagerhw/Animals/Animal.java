package codeclan.com.zoomanagerhw.Animals;

/**
 * Created by user on 10/11/2017.
 */

public abstract class Animal {
    private String name;
    private float cashValue;

    public Animal(String name, float cashValue) {
        this.name = name;
        this.cashValue = cashValue;
    }
}
