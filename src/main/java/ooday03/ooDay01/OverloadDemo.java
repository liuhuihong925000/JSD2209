package ooday03.ooDay01;
//重载的演示
public class OverloadDemo {
    public static void main(String[] args) {
        OverloadAoo o = new OverloadAoo("tom");
        o.show();
        o.show("Tom");
        o.show(25);
        o.show("Jerry",25);

    }
}
