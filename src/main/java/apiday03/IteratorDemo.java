package apiday03;

import ooday08.Inter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
           c.add("one");
           c.add("#");
           c.add("two");
           c.add("#");
           c.add("three");
           c.add("#");
           c.add("four");
           c.add("#");
           c.add("five");
        System.out.println(c);

        Iterator it = c.iterator();  //获取一个迭代器
        while(it.hasNext()) {//若有下一个元素
            String str = (String) it.next(); //获取下一个元素
            System.out.println(str);
            if("#".equals(str)) {
                //c.remove(str);  //迭代器遍历过程中不能通过结合的方法增删元素的
                it.remove();   //删除next（）方法所获取的元素
            }
        }
        System.out.println(c);
    }
}
