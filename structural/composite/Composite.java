package design.patterns.composite;
import design.patterns.composite.Component; 
import java.util.List;
import java.util.ArrayList;

public class Composite implements Component{
    List<Component> components = new ArrayList<Component>();

    public void add(Component component){
        components.add(component);
    }
    public void remove(Component component){
        components.remove(component);
    }
    public Component getChild(int i){
        return components.get(i);
    }
    public void print(){
        System.out.println("Component");
        System.out.println("---");
        for(Component c : components){
            c.print();
        }
    }
}