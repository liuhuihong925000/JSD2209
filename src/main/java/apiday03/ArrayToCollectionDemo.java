package apiday03;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 */
public class ArrayToCollectionDemo {
    public static void main(String[] args) {
        //数组排序
        int[] arrInt = {7,4,3,2,5,6};
        System.out.println("现有数组： " + Arrays.toString(arrInt));
        Arrays.sort(arrInt);
        System.out.println("重新排序： " + Arrays.toString(arrInt));
        System.out.println("重排后第三个元素为："+ arrInt[2]);
        //再创建一个数组
        String[] arr = {"one","two","three","four","five"};

        System.out.println(Arrays.toString(arr));
        //[one, two, three, four, five, six]
        //转集合：

        List<String> ls=   Arrays.asList(arr);
        System.out.println(ls);
        System.out.println("元素个数: "+ ls.size());

       //对数组操作有，集合也会做相应的改变。
        arr[1]= "six";
        System.out.println("Arrays："+ Arrays.toString(arr));
        System.out.println("List: " + ls);


        ls.set(2,"seven"); // 把下标2的元素修改为“seven”
        System.out.println(ls);

         //添加元素/删除元素相当于要往集合中加元素/减元素
        //而数组是定长的，不会自动扩容，所有会发生不支持操作的异常
        //ls.add("!!!");  //运行时发生不支持操作异常
        System.out.println(ls);
    }

}
