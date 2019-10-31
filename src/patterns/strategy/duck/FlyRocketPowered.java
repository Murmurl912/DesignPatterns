package patterns.strategy.duck;

import patterns.strategy.duck.FlyBehavior;

public class FlyRocketPowered extends FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
