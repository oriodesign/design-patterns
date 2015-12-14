public class ConcreteBuilder{
    private Product product;

    public Builder(){
        product = new Product();
    }

    public buildContent(){
        //...
    }

    public buildCost(){
        //...
    }

    public getProduct(){
        return product;
    }


}