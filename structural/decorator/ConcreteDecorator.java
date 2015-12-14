package design.patterns.decorator;
import design.patterns.decorator.Component;
import design.patterns.decorator.Decorator;

public class ConcreteDecorator extends Decorator{
    Component component;
    public ConcreteDecorator(Component component){
        this.component = component;
    }
    public String doSomething(){
        return component.doSomething();
    }
    public String doSomethingElse(){
        String s = component.doSomething();
        s = s + " decorated";
        return s;
    }
}