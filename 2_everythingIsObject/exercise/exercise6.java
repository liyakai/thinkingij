import java.util.Scanner;
public class exercise6 {
    public static void main(String[] args){
        Storage storage = new Storage();
        storage.input();
        System.out.printf("The storage of s need = %d\n",storage.storage(storage.returnS()));
    }
}

class Storage {
    String s;
    
    void input(){
        System.out.println("Please input something.");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        }
    
    int storage(String s) {
        return s.length() * 2;
   }

    String returnS(){
        return s;
    }
}
