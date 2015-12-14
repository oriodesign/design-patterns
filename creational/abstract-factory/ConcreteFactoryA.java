public class ConcreteFactoryA implements AbstractFactory
{
    public ConcreteProductA createProduct()
    {
        ConcreteProductA productA = new ConcreteProductA();   
        return productA;
    }
}