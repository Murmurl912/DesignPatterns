package patterns.strategy;

public class FlyRocketPowered extends FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
