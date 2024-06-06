package apiday01;

import java.util.Arrays;

public class Trim_matches_splitDemo {
    public static void main(String[] args) {
        String s = "          hello world            ";
        System.out.println(s);
        s = s.trim();  //去掉两边的空白字符
        System.out.println(s);

        Boolean bs = s.matches("hello world"); //-- 验证匹配 ,返回一个boolean
        System.out.println(bs);          //--true；

        String[] ns = s.split("hello");
        System.out.println(Arrays.toString(ns));
    }
}
