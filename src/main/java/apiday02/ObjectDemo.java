package apiday02;

public class ObjectDemo {
    public static void main(String[] args) {
        Point p = new Point(100,200);

        System.out.println(p); //如果不重写，返回类的全称@地址
        System.out.println(p.toString());
        System.out.println(p.add());


    Point p1 = new Point(100,200);
    Point p2 = new Point(100, 200);
        System.out.println(p1==p2);   //false,==比较的是地址
        System.out.println(p1.equals(p2));  //因为Point 类重写了equals()方法，现在比较的值的大小是否相等

    String s1 = new String("Hello");
    String s2 = new String("Hello");

        System.out.println(s1.equals(s2));  //String 了类重写了equals() 来比较字符串内容是否相等

    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb1.equals(sb2));   //false, 因为StringBuilder类没有重写equals(), 因此调用的还是object类equals()的地址


    }
}
