package design.patterns.adapter;
import design.patterns.adapter.Adaptee; 
import design.patterns.adapter.Target; 

public class Adapter implements Target{
    
    public String doSomething(){
        Adaptee adaptee = new Adaptee();
        return adaptee.doSomethingDifferent();
    }
}