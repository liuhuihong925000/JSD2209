package ooday02;



import ooday03.ooDay01.OverloadAoo;

import java.util.Arrays;

public class ConsDemo {
    public static void main(String[] args) {
//      Student tom = new Student("Alex", 44, "123 Long Rd");
//        System.out.println(tom);
//        tom.sayHi();
//        tom.study();
   //   声明 实例化（new 一个对象） 创建对象
        OverloadAoo aoo = new OverloadAoo("tommy");

        //对象打点来调用方法
        aoo.show(33);

        aoo.setAge(22);
        int age = aoo.getAge();
        System.out.println(aoo);
    }
}
