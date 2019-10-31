package patterns.strategy.duck;

public class MuteQuack extends QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
