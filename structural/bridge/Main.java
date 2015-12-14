package design.patterns.bridge; 
import design.patterns.bridge.RefinedAbstraction;
import design.patterns.bridge.ConcreteImplementor;

public class Main{
    public static void main(String [] args){
        ConcreteImplementor concreteImplementor = new ConcreteImplementor();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementor);
        System.out.println(refinedAbstraction.on());
        System.out.println(refinedAbstraction.off());
    }
}