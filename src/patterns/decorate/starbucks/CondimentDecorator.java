package patterns.decorate.starbucks;

/**
 * CondimentDecorator extends Beverage and add an instance of Beverage type.
 * It become a wrapper wrap the field of beverage
 * Inherit the abstract class Beverage so that CondimentDecorator has the correct type
 * as the wrapped object instance.
 * The behavior inherit form CondimentDecorator we need override it using the
 * wrapped instance.
 *
 * Using the composition, we can easily add feature at runtime
 * without change the original object
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();

}
