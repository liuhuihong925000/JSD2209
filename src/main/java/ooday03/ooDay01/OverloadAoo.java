package ooday03.ooDay01;

public class OverloadAoo {
    String name;
    private int age;
    public OverloadAoo(String name) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "OverloadAoo{" +
                "Age=" + age +
                ", newAge=" + newAge +
                '}';
    }

    /**
     * 自带（默认）一个无参构造方法
     * public OverloadAoo(){}
     */
     int newAge = age -20;

    //public, protected, 什么都不写， private
     public void show() {
         System.out.println("1. damn it, it cannot remember anything");
     }
     public void show(String name) {
         System.out.println("2.my name is " + name);
     }
    public void show(int age) {
        System.out.println("3. I am " + age + " years old.");
    }
    public void show(String name, int age){
        System.out.println("4");
    }


}
