package com.csi.service;

public class ArithmeticApplication {

    public static void main(String[] args) {
        ArithmeticApplication application = new ArithmeticApplication();

        System.out.println("Add Result: " + application.add(2, 4));
        System.out.println("Sub Result: " + application.sub(9, 2));
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}
