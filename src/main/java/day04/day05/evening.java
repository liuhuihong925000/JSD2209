package day04.day05;

import java.util.Arrays;

public class evening {
    public static void main(String[] args) {
        int arr1[]= new int[8];
        int max=arr1[0];
        for (int i=0; i<=arr1.length-1;i++) {
            arr1[i]=(int) (Math.random()*100);
//            System.out.println(arr1[i]);

            if(max<arr1[i]) {
                max=arr1[i];

            }
        }


        int arr2[] = Arrays.copyOf(arr1,arr1.length+1);
        arr2[arr2.length-1]= max;
        for(int i=0;i<=arr2.length-1;i++) {
            System.out.println(arr2[i]);
//            System.arraycopy(arr1,3,arr2,2,4);
        }
        System.out.println("The maximum number in this array is " + max);
Arrays.sort(arr2);
       for(int i=arr2.length-1;i>=0;i--) {
           System.out.println(arr2[i]);


       }
    }
}
