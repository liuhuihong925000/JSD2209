package apiday03;

//什么是集合： 集合和数组一样，可以保存一组数据，并且提供了操作集合元素的相关方法
import java.util.ArrayList; //线性表，是可以重复集合，并且有序
import java.util.Collection; //接口，是所有集合的顶级接口，封装了所有集合共有的方法
import java.util.Iterator; //迭代器

public class GenericDemo {

    public static void main(String[] args) {
        Collection<Point> c = new ArrayList<Point>();
           c.add(new Point(1,2));
           c.add(new Point(3,4));
           c.add(new Point(5,6));
           c.add(new Point(7,8));

        Iterator<Point> it = c.iterator();

//        while(it.hasNext()) {
//              Point p = it.next();
//              System.out.println(p);
//
//          }

        for (Point p: c) {
            System.out.println(p);
        }



    }

}
