package design.patterns.mediator;

public class Main{
    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator(); 
      
        ConcreteColleague colleague1 = new ConcreteColleague(mediator)
        ConcreteColleague colleague2 = new ConcreteColleague(mediator)
        
        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        colleague1.send("Hello World");
        colleague2.send("Hello"); 
    }
}