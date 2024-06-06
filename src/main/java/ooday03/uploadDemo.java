package ooday03;

public class uploadDemo {
    public static void main(String[] args) {
      Aoo o1 = new Aoo(1,2.54);
      o1.a =10;

      o1.show();

      Boo o2 = new Boo(1,10.42,3);
//      o2.a=2;
//      o2.b=2;

      o2.c = Math.random();
        o2.show();
    }
}
