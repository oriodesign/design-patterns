package design.patterns.composite;

public interface Component{
    public void add(Component employee);
    public void remove(Component employee);
    public Component getChild(int i);
    public void print();
}