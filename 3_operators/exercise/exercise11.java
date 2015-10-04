
public class exercise11 {
    public static void main(String[] args){
        int a = 0x8000;
        while (a != 0) {
            System.out.println("a: " + Integer.toBinaryString(a));
            a >>= 1;
        }
    }
}
