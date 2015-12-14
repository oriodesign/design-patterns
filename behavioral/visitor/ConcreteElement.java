package design.patterns.visitor;
import design.patterns.visitor.Element;

public class ConcreteElement extends Element{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}