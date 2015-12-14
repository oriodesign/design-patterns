public class ConcreteFactoryB implements AbstractFactory
{
    public ConcreteProductB createProduct()
    {
        ConcreteProductB productB = new ConcreteProductB();   
        return productB;
    }
}