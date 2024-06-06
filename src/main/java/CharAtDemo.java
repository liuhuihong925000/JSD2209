import java.util.Random;

public class CharAtDemo {
    /**
     * 根据位置找字符
     * @param args
     */
    public static void main(String[] args) {
        String str = "thinking in Java";
        char c = str.charAt(9); //获取str中下标9 所对应的字符。
        System.out.println(c);  // i

        String line = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(line.length());
        Random rand = new Random();
        int range = rand.nextInt(62);
        char c1 = line.charAt(range);
            System.out.println(c1);
        char c2 = line.charAt(range);
            System.out.println(c2);
        char c3 = line.charAt(range);
            System.out.println(c3);
        char c4 = line.charAt(range);






    }
}
