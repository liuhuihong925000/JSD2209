package ooday02;
//学生类(class)
class Student {
    //成员变量
    String name;   //先声明变量，实例（成员）变量
    int age;
    String address;

    public Student(String name, int age, String address) { // 局部变量 （当前function 中）
        this.name = name;
        this.age = age;
        this.address = address;

    }
       //构造函数，与类同名，没有返回值，void都省略了, 一个类可以有多个构造方法

    //方法
    void study() {
        System.out.println(name+"在学习。。。");
    }

    void sayHi() {
        System.out.println("二大爷好， 我叫" + name + ",今年" + age + "岁了，家住在" + address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}



