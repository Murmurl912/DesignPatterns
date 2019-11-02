package patterns.decorate.starbucks;

/**
 * Base class for all decorator.
 * Beverage is equivalent to the abstract class Component
 *
 * This class make sure that an component after decorating is still has the same type
 * before it was decorated.
 *
 * We use inheritance to achieve the goal of type match rather than gain the behavior
 * from its parents
 */
public abstract class Beverage {

    protected String description;

    public Beverage() {
        this.description = "Unknown Beverage";
    }

    public String getDescription() {
        return description;
    }

    public abstract float cost();

}
