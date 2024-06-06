package apiday01;

public class Substring_indexOf_replaceAllDemo {
    public static void main(String[] args) {
        String str= "www.pittsburgh.edu/fabe.3f";
        String name = str.substring(4, 8); //不包括8
           System.out.println(name);

       name = str.substring(4);  //从4开始
           System.out.println(name);


       int start = str.indexOf(".") +1;   //查找字符串第一次出现
           System.out.println("Start with: "+start);


       int end = str.indexOf(".", start);
           System.out.println("End with:" + end);

       name = str.substring(start, end);
           System.out.println(name);   //pittsburgh


        int last = str.lastIndexOf(".");
        System.out.println("Last dot position: "+ last );  //23

        System.out.println(str.replaceAll("w","c"));
           //替换，所有的w 换成c;  -- 正则表达式 ccc.pittsburgh.edu/fabe.3f








    }
}
