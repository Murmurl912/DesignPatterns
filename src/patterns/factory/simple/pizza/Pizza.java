package patterns.factory.simple.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza  {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List toppings;

    public Pizza() {
        toppings = new ArrayList();
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for(int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public  void box() {
        System.out.println("Please pizza in official PizzaStore box");
    }
}
