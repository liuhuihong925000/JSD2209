package day04.day05;

public class ArrayDemo {
    public static void main(String[] args) {
        double f=3.34556765444444444444444444321;
        int b = (int)(Math.ceil(f*1000));
        System.out.println(b);

        int[] a = new int[2];//声明整型数组a，包含2个元素，每个元素都是int,默认值是0
        boolean[] c=new boolean[26];
        double[] d = new double[10];  //默认值 false

        //int, long, char, short, byte ---0
        //double, float-------------------0.0
        //boolean-------------------------false
        int[] arr= new int[3];
        int[] arr2={234,334,445};
        int[] arr3=new int[]{445,3,442,45};
        int[] arr4;
        arr4=new int[]{45,4,55};

         arr[0] = 4;
         arr[2] = 3;


        System.out.println(arr[0] + arr[1]+ arr[arr.length-1]);

        int[] xx1 = new int[20];
         for (int i=0; i<=xx1.length-1;i++) {
             xx1[i]=(int)(Math.floor(Math.random()*100));
             System.out.println(i+1 + ")" + xx1[i]);
           }


        System.out.println(xx1[0] + xx1[1]+ xx1[xx1.length-1]);



    }
}