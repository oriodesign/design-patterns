package design.patterns.memento;

public class Memento{
    private final String savedState;
    public Memento(String state){
        this.savedState = state;
    }
    public String getSavedState(){
        return this.savedState;
    }
}