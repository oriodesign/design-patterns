package design.patterns.iterator;

public interface Iterator{
    public boolean hasNext();
    public void next();
    public String currentItem();
}