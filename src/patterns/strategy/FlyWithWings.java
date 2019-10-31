package patterns.strategy;

public class FlyWithWings extends FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
