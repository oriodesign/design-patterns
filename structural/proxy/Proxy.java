package design.patterns.proxy;

import design.patterns.proxy.RealSubject;

public class Proxy implements Subject{
    private RealSubject realSubject = null;
    
    public Proxy(){
        this.realSubject = new RealSubject();
    }

    public String doSomething(){
        return realSubject.doSomething();
    }
}