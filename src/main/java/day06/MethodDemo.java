package day06;
//方法的演示


import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
         demo();
         sayHi("250");
         sayHello("二大爷的嘴", 24);
         sayHello("三大爷",35);

        int a[]= getNum();
        int[] c= getNum();
        System.out.println(a);
        System.out.println(c);

        int f = plus(3,8);
        System.out.println(f);

        int m =6, n=7;
        int g =plus(m,n);
        System.out.println("g= " + g);

        int arr[] = testArray();
        System.out.println("arr length is " + arr.length);
        Arrays.sort(arr);
        for(int i=0; i<=arr.length-1; i++) {
            System.out.println(arr[i]);
        }



        System.out.println("--End--");
    }
    public static void demo() {
        System.out.println("二大爷来了");
    }
    public static void sayHi(String name) {      //void 无返回值 (括号里为参数名，逗号隔开)
        System.out.println("二大爷名字叫: "+ name);
    }

    public static void sayHello(String name,int age) {
        System.out.print("name: " + name + "\t" + "\t");
        System.out.println("age: " + age +"\t" );
    }



    public static int[] getNum() {     // ---------此处有返回值，为int类型
        int a = (int)Math.ceil(Math.random()*100);
        int b = (int)Math.ceil(Math.random()*100);
        return new int[]{(int)Math.ceil(Math.random()*100),(int)Math.ceil(Math.random()*100)};
    }

    public static int plus(int num1,int num2) {
      int num= num1+num2;
      return num;  //返回的是num里边的数
                   //可以返回一个数，一个变量的值，一个表达式
    }

    public static int[] testArray() {
        int[] arr = new int[7];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int)(Math.ceil(Math.random()*100));
        }
        return arr;
    }

}
