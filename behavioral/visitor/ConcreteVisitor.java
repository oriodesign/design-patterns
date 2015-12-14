package design.patterns.visitor;

import design.patterns.visitor.Visitor;

public class ConcreteVisitor extends Visitor{
    public double totalPrice = 0;

    public void visitElement(ConcreteElement concreteElement){
        totalPrice += concreteElement.getPrice();
    }
}