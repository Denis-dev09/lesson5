package com.engeto;

public class ValueVsReference {

        public static void main(String[] args) {
        int i = 8;
        Account j = new Account("acc1", 100);
        test(i,j);
        System.out.println(i + " " + j.balance());
    }
        public static void test(int primitive, Account object) {
        primitive = primitive + 1;
        object.deposit(100);
    }

}
