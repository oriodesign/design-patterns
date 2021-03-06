package design.patterns.command;

public class ConcreteCommand1 implements Command{
    Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute(){
        receiver.doSomething();
    }
}