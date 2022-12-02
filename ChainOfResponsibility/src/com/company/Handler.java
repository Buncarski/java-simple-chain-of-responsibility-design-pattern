package com.company;

public interface Handler {
    void setNextChain(Handler nextChain);
    void calculate(int a, int b);
}
