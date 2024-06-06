package apiday03;



import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(1,2));
        System.out.println(c);

//        c.clear();
//        System.out.println(c.isEmpty());
        Point p = new Point(1,2);

        boolean contains = c.contains(p);
        System.out.println(contains);

        c.remove(p);
        System.out.println(c); //移除第一次出现的那个，只删一次

        c.clear();
        System.out.println("现在集合中有几个元素呢？ -- " + c.size());
        System.out.println("是否删干净了？ --"+c.isEmpty());

        Collection cc = new ArrayList();
        Point pp = new Point(1,2);
        cc.add(pp); //将pp 添加到集合cc中--- 将ppd 引用装在cc中。

        System.out.println("pp: "+ pp );
        System.out.println("cc: "+
                cc  );


        // add(), size(), contains（）, clear（）, isEmpty(), remove(), equals()
    }
}
