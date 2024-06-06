package day04.day05;

import java.lang.reflect.Array;

public class loopDemo2 {
    public static void main(String[] args) {
//        Array car = ["audi","volvo","toyota","honda"];

        for (int j = 1; j <= 9; j++) {
            if(j==5) {
                break;
            }
            for (int i = 1; i <= 9; ) {
                int result = i * j;
                System.out.println(i + " X " + j + " = " + result);
                i++;
            }
            System.out.println("continued to " + j);
        }

    }
}
