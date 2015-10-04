
public class exercise12 {
    public static void main(String[] args) {
        int a  = 0xffff;
        System.out.println("a: " + Integer.toBinaryString(a));
        while (a != 0) {
            a <<= 1;
            a >>>= 1;
            System.out.println("a: " + Integer.toBinaryString(a));
        }
    }
}
