package design.patterns.flyweight;
import design.patterns.flyweight.Flyweight;

public class ConcreteFlyweight implements Flyweight{
    private String intrinsicData;
    public ConcreteFlyweight(String intrinsicData){
        this.intrinsicData = intrinsicData;
    }
    public String doSomething(String extrinsicData){
        return "something intrinsic" + intrinsicData + " extrinsic " + extrinsicData;
    }
}