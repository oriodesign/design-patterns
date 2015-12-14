package design.patterns.bridge; 
import design.patterns.bridge.Abstraction;
import design.patterns.bridge.Implementor;
import design.patterns.bridge.ConcreteImplementor;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor){
        super(implementor);
    }
    public String otherMethod(){
        return "other method";
    }
}