// Passing objects to methods may not ne what you're used to.

class Letter {
    double c;
}

public class exercise3 {
    static void f(Letter y) {
        y.c = 13.3;
    }
    public static void main (String[] args) {
        Letter x = new Letter();
        x.c = 5.7;
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}
/* Output:
 * 1: x.c: a
 * 2: x.c: z
 * */
