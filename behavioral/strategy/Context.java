package design.patterns.strategy;

import design.patterns.strategy.Strategy;

public class Context {

    public Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(){
        this.strategy.execute();
    }


}

