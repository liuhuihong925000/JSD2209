package apiday03;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperDemo {
    public static void main(String[] args) {
     Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:" + c1);
     Collection c2 = new ArrayList();
        c2.add("andriod");
        c2.add("ios");
        c2.add("java");
      System.out.println("c2:" + c2);

      c1.addAll(c2);    //adAll 把两个集合进行拼接
        System.out.println(c1);



    }

}
