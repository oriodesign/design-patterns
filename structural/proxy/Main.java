package design.patterns.proxy;

import design.patterns.proxy.Proxy;
import design.patterns.proxy.Subject;

public class Main{
    public static void main(String[] args){
        Subject proxy = new Proxy();
        proxy.doSomething();
    }
}