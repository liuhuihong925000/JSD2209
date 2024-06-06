package apiday04;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List 集合的演示
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> ls= new ArrayList<>();
          ls.add("one");
          ls.add("two");
          ls.add("three");
          ls.add("four");
          ls.add("five");
        //  ls.add(123); //已经指定了<String>类型，所以无法加入非String类型
        System.out.println(ls.get(2)); //three
        String e = ls.get(3);
        System.out.println(e);

        //遍历list集合，方法一：
        System.out.println("\n"+"遍历list集合，方法一："+ "\n");
        // /换行
        for(int i=0; i<=ls.size()-1; i++ ){
            System.out.println("第"+i+"个元素："+ls.get(i));
        }

        //遍历list集合，方法二： for循环 新循环JDK1.5推出
        System.out.println("\n"+"遍历list集合，方法二"+"\n");
           for(String s: ls) {
               System.out.println(s); // s指代每一个元素
           }

        //遍历list集合，方法三：while循环
        System.out.println("\n"+"遍历list集合，方法三:"+"\n");
        Iterator<String> i = ls.iterator();  //创建一个迭代器

          while(i.hasNext()) {    //有吗？ 有，那就继续
              System.out.println(i.next());
          }


        System.out.println("\n");

          //将下标为3的元素设置为seven,返回原始元素值
        String old = ls.set(3,"seven");

        System.out.println("set方法执行后，被拿下的值是" + old);  // 返回原始原始 four

        //ls.set(2,"six"); //常规用法，不用返回值
        System.out.println("set方法执行后的List：" + ls);

        System.out.println("--------------");

        /**
         * Void add(int index, E e):
         * 及将给定原始e添加到index 所指的的位置，相当于插入操作
         */
        ls.add(3,"four");//将four 插入到下标3的位置（第四个元素）
        System.out.println("add方法后的list:" + ls);
        System.out.println("----------");

        /**
         * E remove(int index)
         * 删除指定位置元素，并返回删除位置元素
         */

        String o = ls.remove(4);
        System.out.println(o);
        System.out.println("remove后的list" + ls);
        System.out.println("-----------");


    }

}
