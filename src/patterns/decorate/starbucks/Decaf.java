package patterns.decorate.starbucks;

/**
 * A specific component represent a type of coffee
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public float cost() {
        return 1.99f;
    }
}
