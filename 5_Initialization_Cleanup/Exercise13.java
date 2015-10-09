public class Exercise13 {

static class Cup {
    Cup(int maker) {
        System.out.println("Cup(" + maker + ")");
    }
    void f(int maker) {
        System.out.println("f(" + maker + ")");
    }
}

static  class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);       // (1)
    }
    // static Cups cups1 = new Cups();    // (2)
    // static Cups cups2 = new Cups();    // (2)
} 
