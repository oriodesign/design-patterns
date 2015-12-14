package design.patterns.interpreter;

import design.patterns.interpreter.Context;

public class Main{
    public static void main(String[] args){
        Context context = new Context();
        Expression expression  = new Expression("books by author");
        String result = expression.interpret(context);
    }
}