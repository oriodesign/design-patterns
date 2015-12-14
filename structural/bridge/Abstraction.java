package design.patterns.bridge; 
import design.patterns.bridge.Implementor;
import design.patterns.bridge.ConcreteImplementor;

public abstract class Abstraction{
    private Implementor implementor;
    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public String on(){
        return implementor.on();
    }
    public String off(){
        return implementor.off();
    }
}