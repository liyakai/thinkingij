import java.util.*;
public class exercise13 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        char a = 0;
        int b = 0;
        while(true) {
            b = rand.nextInt(255);
            a = (char)b;
            System.out.println("a :" + Integer.toBinaryString(a));
        }
    }
}
