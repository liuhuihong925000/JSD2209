package ooday03.ooDay01;
//学生类
class Student {
   //成员变量
    String name;   //成员变量
    int age;
    String address;

    public Student(String name, int age, String address) { // 局部变量 （当前function 中）
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("bye");
    }

    public Student() {

    }



    //方法
    void study() {
        System.out.println(name+"在学习。。。");
    }

    void sayHi() {
        System.out.println("二大爷好， 我叫" + name + ",今年" + age + "岁了，家住在" + address);
    }
}
