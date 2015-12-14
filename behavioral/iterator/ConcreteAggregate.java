package design.patterns.iterator;

import design.patterns.iterator.Iterator;

public class ConcreteAggregate{
    Iterator iterator;
    ArrayList<String> list; 

    public ConcreteAggregate(ArrayList<String> list){
        this.list = list;
    }

    public createIterator(){
        this.iterator = new ConcreteIterator(list);
    }
}