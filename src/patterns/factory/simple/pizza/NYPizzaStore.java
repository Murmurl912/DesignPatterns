package patterns.factory.simple.pizza;

public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {

    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese": {
                pizza = new NYStyleCheesePizza();
            } break;

            case "pepperoni": {
                pizza = new PeperoniPizza();
            } break;

            case "clam": {
                pizza = new ClamPizza();
            } break;

            case "veggie": {
                pizza = new VeggiePizza();
            } break;
        }

        return pizza;    }
}
