package day04.day05;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
//        int result;
        for (int num = 1; num <= 9; num++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(num + " * " + i + " = " + i * num + "\t " +"\t");
            }
            System.out.println();
        }


    }
}