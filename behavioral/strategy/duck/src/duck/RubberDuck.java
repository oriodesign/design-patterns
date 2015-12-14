package duck;


public class RubberDuck extends Duck {
 
    public RubberDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Squeak();
    }

}

