package design.pattern;


public class Adapter implements Adaptee, Target{
    
    public String doSomething(){
        return doSomethingDifferent();
    }

    public String doSomethingDifferent(){
        return "ok";
    }
}