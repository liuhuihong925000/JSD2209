package apiday01;

public class StringBuilderDemo  {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();    //空字符串
        StringBuilder builder2 = new StringBuilder("abc");  //abc串
              System.out.println(builder2);                 //builder2--abc
        String str = new String("cba");              //灰色代表冗余，可以直接写： String str ="cba"
                             // String 是不变对象，一旦赋值，不能再改了。

        StringBuilder builder3 = new StringBuilder(str);    //将String类型，转成StringBuilder 然后进行append, delete, replace, insert 增，删，改，插
              System.out.println("StringBuilder类: "+builder3);                     //str--cba

        String str2 = builder3.toString();  //将builder3转为字符串类型

       //增，删，改，插；append（增）, delete（删）, replace（改）, insert（插）.
        String str1 = "好好学Java，";     //String 自身无法完成append, replace, insert, delete
           StringBuilder builder = new StringBuilder(str1);

        builder.append("为了找个好工作");    //增
           System.out.println(str1);
           System.out.println(builder);

        builder.replace(8,16,"就是为了改变世界");  //改
           System.out.println(builder);

        builder.delete(0,7);                     //删
           System.out.println("delete" + builder);

        builder.insert(0,"活着");       //插
           System.out.println(builder);

           String str3 =  builder.toString();
    }
}
