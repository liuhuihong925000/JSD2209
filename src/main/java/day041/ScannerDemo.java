package day041;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//   import java.util.Scanner;
//       Scanner scan= new Scanner();
//        int a = scan.nextInt();
//
//
//
//   Package java.util;
//   class Scanner {
//      Scanner(Stream s) {....   方法名
//
//      }
//        int nextInt(){...}
//        double nextDouble() { ... }
//   }

        Scanner scan = new Scanner(System.in);  // 新建了一个扫描仪叫scan  构造了（new了）一个对象，并传参
        System.out.println("Enter Your bidder number:");
        int bidNumber = scan.nextInt();  //扫描一个整数并赋值给bidNumber; 对象打点去调取

        System.out.println("Enter Your Offer");
        double offer = scan.nextDouble();
        System.out.println("Your bid number is: " + bidNumber + ", Your Offer is: " + offer);





    }
}
