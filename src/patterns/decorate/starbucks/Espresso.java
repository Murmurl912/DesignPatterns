package patterns.decorate.starbucks;

/**
 * A specific component, every component is a type of coffee
 * Here we can add our unique methods and filed for this component
 * or override it.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public float cost() {
        return 1.99f;
    }
}
