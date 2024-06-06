package apiday04;

import apiday03.Point;

import java.util.*;

public class ListSortDemo   {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
          ls.add("ssstcc");
          ls.add("trxxrr");
          ls.add("xbrac");
          ls.add("ttcer");
          ls.add("asftre");
        Collections.sort(ls, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length(); //升序，字符个数
                                                 //反之，降序

            }
        });
        System.out.println(ls);


        }



//        List<Integer> ls = new ArrayList<>();
//        Random rand = new Random();
//        for(int i=0; i<10; i++) {
//            ls.add(rand.nextInt(100));
//        }
//        Collections.sort(ls);
//           System.out.println(ls);//对list集合进行自然排序，升序
//
//        Collections.reverse(ls);//反转
//           System.out.println(ls);
//           System.out.println(ls.get(5));
    }


