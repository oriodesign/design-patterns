package design.patterns.composite;
import design.patterns.composite.Component; 
import design.patterns.composite.Composite; 

public class Client{
    public void test(){
        Component c1 = new Composite();
        Component c2 = new Composite();
        Component c3 = new Composite();
        Component c4 = new Composite();
        c3.add(c4);
        c1.add(c2);
        c1.add(c3);
        c1.print();
    }
}