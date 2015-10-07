import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt();
        int b;
        while(true){
            b = rand.nextInt();
            if (a > b)
                System.out.println(a + " > " + b);
            else if (a < b) 
                System.out.println(a + " < " + b);
            else
                System.out.println(a + " = " + b);
            a = b;
        }
    }
}
