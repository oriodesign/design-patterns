package design.patterns.decorator;
import design.patterns.decorator.ConcreteDecorator;
import design.patterns.decorator.ConcreteComponent;

public class Main{
    public static void main(String [] args){
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        System.out.println(concreteDecorator.doSomethingElse());
    }
}