package ooday03.ooDay01;
   //学生的测试类
public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生对象；
        Student zs= new Student("tom", 35, "123 long rod");
        //访问成员变量
        zs.name="Tom";
        zs.address="123 Doe Rd";
        zs.age=33;

        zs.study();
        zs.sayHi();

        Student denny = new Student("Jenny",44,"134 short road");
//        denny.name="Denny";
//        denny.age=44;
//        denny.address="2340 long road";

        denny.study();
        denny.sayHi();
    }
}
