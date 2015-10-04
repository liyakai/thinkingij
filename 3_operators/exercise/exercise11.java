
public class exercise11 {
    public static void main(String[] args){
        int a = 0x8000;
        System.out.println("a: " + Integer.toBinaryString(a));
        while (a != 0) {
            a >>= 1;
            System.out.println("a: " + Integer.toBinaryString(a));
        }
    }
}
