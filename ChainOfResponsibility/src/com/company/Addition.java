package com.company;

public class Addition implements Handler{
    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
        if(chain != null)
            this.chain.calculate(a, b);
    }
}
