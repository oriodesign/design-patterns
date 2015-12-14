package design.patterns.flyweight;
import design.patterns.flyweight.ConcreteFlyweight;
import design.patterns.flyweight.FlyweightFactory;
import design.patterns.flyweight.Flyweight;

public class Main{
    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory(); 

        Flyweight flyweight1 = factory.getFlyweight("test"); 
        Flyweight flyweight2 = factory.getFlyweight("test"); 

        System.out.println(flyweight1.doSomething("A"));
        System.out.println(flyweight2.doSomething("B"));


    }
}