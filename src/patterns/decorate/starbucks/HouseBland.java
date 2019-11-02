package patterns.decorate.starbucks;

/**
 * An implement of Beverage, represent as a kind of coffee
 */
public class HouseBland extends Beverage {

    public HouseBland() {
        description = "House Blend Coffee";
    }

    @Override
    public float cost() {
        return 0.89f;
    }
}
