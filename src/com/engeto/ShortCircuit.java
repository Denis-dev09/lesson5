package com.engeto;

public class ShortCircuit {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        if (++i < 30 || i > 5)
        {
            System.out.println();
        }
        System.out.println(i);

    }
}
