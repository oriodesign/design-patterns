package duck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        this.quackBehaviour.quack();
    }

    public void performFly(){
        this.flyBehaviour.fly();
    }

}

