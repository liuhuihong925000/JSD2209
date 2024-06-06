package ooday08;

public class MultiType {
    public static void main(String[] args) {
//    Aoo ooa = new Aoo();

     Aoo oa = new Boo();     //向上造型

     Aoo ox = new Coo();

     Boo o1 = (Boo) oa;
     o1.testInter();
     o1.showBoo();


     Inter o2 = (Inter)oa;
     o2.testInter();

//     Coo o3 = (Coo)ox;
    if(oa instanceof Boo) {//判断 oa对象是否可以转
        Boo o4 = (Boo) oa;

        System.out.println("o4 OK");
    } else {
        System.out.println("o4不是Coo类型");}

     System.out.println(oa instanceof Boo);
     System.out.println(ox instanceof Coo);
     System.out.println(oa instanceof Inter);
     System.out.println(oa instanceof Aoo);
    }
}
