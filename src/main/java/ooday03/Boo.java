package ooday03;

public class Boo extends Aoo{
    int b;

    public Boo(int a, double c, int b) {
        super(a, c);
        this.b = b;
    }

    void show() {   //override
       System.out.println("float number c is equal to " + c);
   }
}
