package com.engeto;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0)
                break;
            list.add(input);
        }

        System.out.println(list.get(1) + list.get(2));
    }
}
