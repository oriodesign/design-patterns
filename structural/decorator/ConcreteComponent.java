package design.patterns.decorator;
import design.patterns.decorator.Component;

public class ConcreteComponent implements Component{
    public String doSomething(){
        return "something";
    }
}