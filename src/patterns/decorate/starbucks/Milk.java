package patterns.decorate.starbucks;

/**
 * This is the decorator, It is used to decorator specific component.
 */
public class Milk extends CondimentDecorator {
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.1f;
    }
}
