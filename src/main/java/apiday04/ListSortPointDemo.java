package apiday04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortPointDemo {
    public static void main(String[] args) {
        List<Point> ls = new ArrayList<>();
        ls.add(new Point(5,5));
        ls.add(new Point(14,4));
        ls.add(new Point(4,3));
        ls.add(new Point(7,8));

        System.out.println("原始list数据： "+ ls);

        ls.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX() * o1.getX() + o2.getY() * o2.getY();
                int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
                return len1 - len2;    //按照升序排列
            }
        });
        System.out.println(ls);
/*
        Collections.sort(ls, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
//                return o2.getX()-o1.getX()  ; // 按照x坐标的降序排列

                //坐标里原点远近距离怕排序
            int len1 = o1.getX()*o1.getX()+o2.getY()*o2.getY();
            int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
            return len1-len2;    //按照升序排列
            }
        });
        System.out.println(ls );

 */
    }
}
