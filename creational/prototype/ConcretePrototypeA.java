public class ConcretePrototypeA{
    public String name; 
    public ConcretePrototypeA(String name){
        name = name;
    }
    public Prototype clone(){
        return new ConcretePrototypeA();
    }
}