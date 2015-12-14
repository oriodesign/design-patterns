package design.patterns.adapter;
import design.patterns.adapter.Client; 

public class Main {
    public static void main(String [] args){
        Client client = new Client();
        String result = client.test();
        System.out.println(result);
    }
}