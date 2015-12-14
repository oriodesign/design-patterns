package design.patterns.strategy;

public class Main{
    public static void main(String[] args){
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        
    }
}