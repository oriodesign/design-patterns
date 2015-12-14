public class Client
{
    public void buildProduct(AbstractFactory abstractFactory)
    {
        Product product = abstractFactory.createProduct();   
        
    }
}