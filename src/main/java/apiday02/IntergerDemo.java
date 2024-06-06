package apiday02;

import ooday08.Inter;

public class IntergerDemo {
    public static void main(String[] args) {

        //触发了自动装箱特性，会被编译为 Integer i1 = Integer.valueOf(5);

        Integer i = new Integer(400);
        Integer i1 = 500; // 基本类型--> 包装类型--- 装箱

        Integer i2 = Integer.valueOf(500);

        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        //触发了自动拆箱特性，会被编译为，int j = i.intValue();
        int j = i1; //包装类型到基本类型，拆箱

//1)通过包装类来找最大值和最小值
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("int最大值为： " + max + ", 最小值为：" + min);

        //2)  包装类可以将字符串转换成对应的基本类型--必须熟练掌握
        String s1= "38";
        String s2 = "45";
        System.out.println(s1+s2);
        int age1 = Integer.parseInt(s1);
        int age2 = Integer.parseInt(s2);

        System.out.println(age1+age2);

    }
}
