package patterns.strategy.duck;

import patterns.strategy.duck.FlyBehavior;

public class FlyWithWings extends FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
