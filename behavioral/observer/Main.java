package design.patterns.observer;

public class Main{
    public static void main(String[] args){
        Subject s1 = new ConcreteSubject();
        Observer o1 = new ConcreteObserver();
        Observer o2 = new ConcreteObserver();
        s1.attach(o1);
        s1.attach(o2);
        s1.notify();
    }
}