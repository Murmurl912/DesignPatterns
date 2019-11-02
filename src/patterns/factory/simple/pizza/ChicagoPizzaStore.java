package patterns.factory.simple.pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}
