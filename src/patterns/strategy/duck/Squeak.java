package patterns.strategy.duck;

import patterns.strategy.duck.QuackBehavior;

public class Squeak extends QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak squeak squeak...");
    }
}
