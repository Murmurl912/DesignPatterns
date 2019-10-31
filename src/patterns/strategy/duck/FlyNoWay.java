package patterns.strategy.duck;

import patterns.strategy.duck.FlyBehavior;

public class FlyNoWay extends FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
