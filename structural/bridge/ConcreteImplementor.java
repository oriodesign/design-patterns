package design.patterns.bridge; 
import design.patterns.bridge.Implementor;

public class ConcreteImplementor implements Implementor{
    public String on(){
        return "on";
    }
    public String off(){
        return "off";
    }
}