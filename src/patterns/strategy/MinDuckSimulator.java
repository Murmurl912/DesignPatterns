package patterns.strategy;

/**
 * When you combine two classes together , like Duck class in this section,
 * these are composition.
 * This method differs from inheritance in that the behavior of the duck is not inherited,
 * but the combination of appropriate behavior object
 *
 */
public class MinDuckSimulator {

    public static void main(String[] args) {
        System.out.println("Mallard Duck");
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();

        System.out.println("Model Duck");
        Duck model = new ModelDuck();
        model.quack();
        model.fly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();
    }
}
