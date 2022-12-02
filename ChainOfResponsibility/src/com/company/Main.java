package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        Handler chain1 = new Addition();
        Handler chain2 = new Subtraction();
        Handler chain3 = new Multiplication();
        Handler chain4 = new Subtraction();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        while (true){
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            b = in.nextInt();
            chain1.calculate(a, b);
        }
    }
}
