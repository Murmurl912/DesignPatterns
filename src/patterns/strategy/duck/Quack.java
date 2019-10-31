package patterns.strategy.duck;

public class Quack extends QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack quack...");
    }
}
