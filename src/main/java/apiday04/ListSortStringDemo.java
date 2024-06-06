package apiday04;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 字符串集合的排序
 */
public class ListSortStringDemo {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
          ls.add("tom");
          ls.add("jerry");
          ls.add("jack");
          ls.add("rose");
          ls.add("Kabe");
        System.out.println("list的原始数据" + ls);
          Collections.sort(ls); //ASCII码进行排序
        System.out.println("list吧排序后的数据"+ls);



    }
}
