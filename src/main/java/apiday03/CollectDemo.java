package apiday03;

import java.util.ArrayList;
import java.util.Collection;

public class CollectDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(25);
        c.add("one");
        c.add("two");
        System.out.println(c);  //Collection在中重写了Object的toString()方法。
        System.out.println("size: " + c.size());    //c.size 集合c元素的个数
        System.out.println(c.isEmpty()); // 返回boolean值，数组是否为空

        System.out.println("是否包含25:"+ c.contains(25));  //是否包含
        c.clear();
        System.out.println("集合是否为空"+ c.isEmpty());
    }


}
