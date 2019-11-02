package patterns.decorate.starbucks;

/**
 * A specific component represent as a type of coffee
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public float cost() {
        return 0.99f;
    }

}
