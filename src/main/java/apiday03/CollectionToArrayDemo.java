package apiday03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.List;
/**
 * 集合转换成数组
 * 集合可以扩容，数组不行
 */

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c); //[one, two, three, four, five]
        //System.out.println(c[1]);
        System.out.println(c.size()); // ---元素个数


       //转数组
        String[] arr =c.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}
