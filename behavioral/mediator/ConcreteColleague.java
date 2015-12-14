package design.patterns.mediator;

import design.patterns.mediator.Colleague;

public class ConcreteColleague implements Colleague{
    private Mediator mediator;
    public ConcreteColleague(Mediator m)
    {
        mediator = m;
    }
    //send a message via the mediator
    public void send(String message)
    {
       mediator.send(message, this);
    }
    
    //get access to the mediator
    public Mediator getMediator()
    {
        return mediator;
    }

    public abstract void receive(String message){
        System.out.println("Colleague Received: " + message);
    }
}