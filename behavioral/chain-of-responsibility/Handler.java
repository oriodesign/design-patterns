package design.patterns.chain;

public interface Handler{
    public void setNext(Handler handler);
    public void handleRequest(String request);
}