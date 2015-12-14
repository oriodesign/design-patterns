package design.patterns.adapter;
import design.patterns.adapter.Target; 
import design.patterns.adapter.Adapter; 

public class Client{

    // Now you can use Adaptee Class as Target Class
    public String adapteeTester(Target target) {
        return target.doSomething();
    }

    public String test(){
        Adapter adapter = new Adapter();
        return adapteeTester(adapter);
    }

}