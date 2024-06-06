package apiday01;

public class StringDemo {
    public static void main(String[] args) {
        String s = new String("hello "); //String 是不变对象，一旦赋值，不能再改了。
        String s1 = "hello";

        System.out.println("s:" + s );
        System.out.println("s1:" + s1);
        System.out.println(s1 == s);    // false, ==比较的是地址是否相等
        System.out.println(s.equals(s1));  //true, equals（）字符串内容是否相等
        System.out.println(s.length());
    }
}
