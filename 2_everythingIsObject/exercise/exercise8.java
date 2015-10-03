import java.util.Scanner;
public class exercise8 {
    public static void main(String[] args){
        boolean b = true;
        while (b) {
            System.out.println("Do you want to create a new object(y/n)?");
            Scanner input = new Scanner(System.in);
            String  yn  = input.nextLine();
            if (yn.equals("y")) 
                b = true;
            else
                b = false;
            StaticField sf = new StaticField();
            System.out.printf("i = %d\n", StaticField.i);
        }
    }
}

class StaticField {
    static int i = 0;
    StaticField(){
        i++;
    }
}
