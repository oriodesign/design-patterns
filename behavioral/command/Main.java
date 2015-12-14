package design.patterns.command;

public class Main{
    public static void main(String[] args){
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Command concreteCommand1 = new ConcreteCommand1(receiver);
        Command concreteCommand2 = new ConcreteCommand2(receiver);
        invoker.setCommand(concreteCommand1);
        invoker.invoke();
        invoker.setCommand(concreteCommand2);
        invoker.invoke();
        
    }
}