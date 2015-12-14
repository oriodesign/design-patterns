package design.patterns.chain;

public class ConcreteHandler1 implements Handler{
    private Handler nextHandler;
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }
    public void handleRequest(String request){
        if(/* can handle */){
            // doSomething
        }else{
            nextHandler.handleRequest();
        }
    }
}