package apiday03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo {
    public static void main(String[] args) {
        int[] arrNumber={1,2,3,4,5,6,7};
        boolean[] arrB= {false,true};

        System.out.println(Arrays.toString(arrNumber));


        String[] arr = {"one","two","three","four","five"};
           for(int i =0; i<= arr.length-1; i++) {
               System.out.println(arr[i]);
           }
        System.out.println(Arrays.toString(arr));

           //新循环遍历数组-- 编译器改为普通的for 循环
           for(String cpu: arr) {
              System.out.println(cpu + ",");

          }

        Collection c = new ArrayList();
           c.add("one");
           c.add("two");
           c.add("three");
           c.add("four");
           c.add("five");
        System.out.println(c);


        Iterator it = c.iterator(); // 创建一个迭代器
        while (it.hasNext()) {
            String str = (String)it.next();
            System.out.println(str + "--");
        }

        //新循环遍历集合---会被编译器改为迭代器遍历
        //for(元素类型 变量名： 集合或数组） {
        // 循环体
        // }
        for(Object obj : c) {
            String cpr = (String)obj;
            System.out.println(cpr.toUpperCase());

        }
    }
}
