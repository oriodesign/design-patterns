package design.patterns.iterator;

public class Main{
    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        while(iterator.hasNext()){
            String item = iterator.currentItem();
        }
    }
}