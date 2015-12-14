package design.patterns.proxy;
import design.patterns.proxy.Subject;

public class RealSubject implements Subject{
    public String doSomething(){
        return "ok";
    }
}