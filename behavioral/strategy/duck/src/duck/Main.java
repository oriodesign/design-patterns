package duck;

public class Main{
    public static void main(String[] args){
        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();

        rubberDuck.performFly();
        rubberDuck.performQuack();

        mallardDuck.performFly();
        mallardDuck.performQuack();
        
    }
}