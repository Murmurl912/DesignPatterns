package patterns.factory.simple.pizza;

/**
 * orderPizza() method perform lots of operations with pizza, such as prepare, bake, cut, box, but
 * as Pizza is abstract, orderPizza() don't which actual concrete class are involved.
 * In other word, this is decoupling
 */
public abstract class PizzaStore {

    public PizzaStore() {

    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);
        // orderPizza() invoke createPizza() to get pizza
        // but it don't know what it will get
        // the decision is make by subclass' implementation
        // The following part is standard way create pizza
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * factory method is used to handle object creation, and pack this behavior
     * in subclass. In this way, client program's supclass's code and subclass
     * object creation is decoupled
     * @param type
     * @return
     */
    public abstract Pizza createPizza(String type);
}
