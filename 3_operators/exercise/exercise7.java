import java.util.*;
public class exercise7 {
    public static void main(String[] args){
        Random rand = new Random(47);
        boolean b = true;
        String fn;
        while (b) {
            System.out.println("Toss a coin.(y/n)");
            Scanner input = new Scanner(System.in);
            fn = input.nextLine();
            if (fn.equals("y")){
                b = true;
                if (rand.nextInt(100) > 50)
                    System.out.println("The coin is positive side");
                else 
                    System.out.println("The coin is negative side");
            } else 
                b = false;
        }    
    }
}
