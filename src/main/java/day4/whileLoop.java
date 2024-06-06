package day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.ceil(Math.random() * 1000));
        System.out.println(num);

        int guess;

        do {
            System.out.println("give it a try!");
            guess = scan.nextInt();
            if (guess > num) {
                System.out.println("too big, enter a smaller number");
            } else if (guess < num) {
                System.out.println("too small, enter a larger number");
            } else {
                System.out.println("bingo, good guess");
            }
        } while (guess != num) ;

    }
}




