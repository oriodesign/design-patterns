package design.patterns.flyweight;
import design.patterns.flyweight.ConcreteFlyweight;
import design.patterns.flyweight.Flyweight;
import java.util.Map;
import java.util.HashMap;

public class FlyweightFactory{
    private Map<String, Flyweight> flyweightsPool = new HashMap<String, Flyweight>();
 
    public Flyweight getFlyweight(String flyweightName) {
        Flyweight flyweight = flyweightsPool.get(flyweightName);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(flyweightName);
            flyweightsPool.put(flyweightName, flyweight);
        }
        return flyweight;
    }
}