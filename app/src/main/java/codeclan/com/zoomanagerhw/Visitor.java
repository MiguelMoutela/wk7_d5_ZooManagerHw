package codeclan.com.zoomanagerhw;

/**
 * Created by user on 11/11/2017.
 */

public class Visitor {
    private String name;
    private float funds;
    
    public Visitor(String name, float funds) {
        this.name = name;
        this.funds = funds;
    }
    public String getName() {
        return name;
    }

    public float getFunds() {
        return funds;
    }
//It would be cool if this method had an else statement
    public void reduceFunds(float amount) {
        if (amount < this.funds) {
            this.funds -= amount;
        }
    }
    public void increaseFunds(float amount) {
        this.funds = amount;
    }
}
