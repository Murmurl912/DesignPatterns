package patterns.strategy.duck;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;


    public Duck() {

    }

    public abstract void display();

    public void fly() {
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void quack() {
        if(quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        this.flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior behavior) {
        this.quackBehavior = behavior;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
