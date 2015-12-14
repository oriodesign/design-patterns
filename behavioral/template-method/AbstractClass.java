package design.patterns.template;

public abstract class AbstractClass{
    public final void templateMethod(){
        operation1();
        operation2();
        operation3();
    }
    protected abstract void operation1();
    protected abstract void operation2();
    protected abstract void operation3();
}