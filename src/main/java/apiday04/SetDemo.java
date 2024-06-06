package apiday04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//          set.add("one");
//          set.add("two");
//          set.add("three");
//          set.add("four");
//
//        System.out.println(set);

        List<String> ls = new ArrayList<>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        ls.add("five");
        ls.add("three");
        System.out.println("原集合"+ls );

        Set<String> set = new HashSet<>();
        set.addAll(ls);
        System.out.println("新集合"+ set);

    }


}
