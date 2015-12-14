public class Director{
    
    public createBasicProduct(){
        ConcreteBuilder cb = new ConcreteBuilder;
        cb.buildContent("basic");
        cb.buildCost();
        return cb.getProduct();
    }
    public createAdvancedProduct(){
        ConcreteBuilder cb = new ConcreteBuilder;
        cb.buildContent("advanced");
        cb.buildCost();
        return cb.getProduct();
    }
}