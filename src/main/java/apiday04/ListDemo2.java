package apiday04;


import java.util.*;

/**
 * List 提供了获取子集的操作方法：
 * List subList(int start, int end) 含头不含尾
 */
public class ListDemo2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,};
        int[] arr1 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);


        List<Integer> ls = new ArrayList();
        for (int i=0; i<10; i++) {
            ls.add(i*10);
        }
        System.out.println(ls);

        List<Integer>subls = ls.subList(3,7);  //获取下标3到6的子集
        System.out.println("sublist: " + subls); //sublist: [30, 40, 50, 60]
        System.out.println("---------");

        //将子集的每个元素扩大10倍
        for(int i=0; i<= subls.size()-1; i++){
            Integer old = subls.set(i, subls.get(i)*10);
            System.out.println("被替换的数：" + old); //被移除的值
        }
        System.out.println("新的subList:"+subls); //[300, 400, 500, 600]
        System.out.println("原集变为: " + ls);//子集改变，原集也会跟着变
        //原集: [0, 10, 20, 300, 400, 500, 600, 70, 80, 90]
        //集合对象只有一个; 注意对子集的操作也会影响原集
        System.out.println("-----------------");

        ls.set(3,3000);
        System.out.println("set方法后，原集：" + ls);//原集：[0, 10, 20, 3000, 400, 500, 600, 70, 80, 90]
        System.out.println("子集" + subls);//子集[3000, 400, 500, 600]
        System.out.println("----------------");

        Collections.reverse(ls);
        System.out.println("集合反转后：" + ls);
        System.out.println("子集也跟着反转"+ subls);
        System.out.println("----------------");

        ls.add(100);
        System.out.println(ls);
       // System.out.println(subls); //运行并发修改异常，原集修改之后，子集将不能再进行任何操作，
        //但是可以重新获取自己
        System.out.println("--------------");

        ls.remove(0);//删除list中的第一个元素
        System.out.println(ls);
        // System.out.println(subls); //运行报异常，原集修改之后，子集将不能再进行任何操作，
        //但是可以重新获取自己

    }
}
