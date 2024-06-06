package apiday01;

public class IndexOfDemo {
    public static void main(String[] args) {
        String str ="thinking in Java";
        int index =str.indexOf("in"); //检索in在str字符串中第一次出现的位置
           System.out.println(index);  // 2

        index = str.indexOf("in",3);//检索in在字符串str中，从下标3以后找，第一次出现的位置
        System.out.println(index);   //5

        index=str.indexOf("abc");   //检索不存在
        System.out.println(index);   //-1

        index =str.lastIndexOf("in");//最后一次出现的位置
        System.out.println(index);   // 9


    }

}
