package design.patterns.visitor;

public class Main{
    public static void main(String[] args){
        ArrayList<Element> elements = new ArrayList<Element>();
        ConcreteVisitor visitor = new ConcreteVisitor();
        for(Element element : elements){
            element.accept(visitor);
        }
        return visitor.getTotalCost();
    }
}