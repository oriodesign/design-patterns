package duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

}

