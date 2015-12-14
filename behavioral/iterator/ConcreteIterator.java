package design.patterns.iterator;

public class ConcreteIterator{
    private List<String> list;
    private int currentPos = 0;
    public ConcreteIterator(List<String> list){
        this.list = list;
    }
    public void next(){
        currentPos++;
    }
    public boolean hasNext(){
        if(currentPos + 1 < list.size()){
            return true;
        }
        return false;
    }
    public String currentItem(){
        return list.get(currentPos);
    }
}