package design.patterns.memento;

public class Originator{
    public String state = "start";
    public void setState(String state){
        this.state = state;
    }
    public setMemento(Memento memento){
        this.state = memento.getSavedState();
    }
    // save
    public createMemento(){
        return new Memento();
    }
}