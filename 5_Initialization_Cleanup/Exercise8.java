public class Exercise8 {
    public static void main(String[] args) {
        AClass a = new AClass();
        a.a();
    }
}

class AClass {
    void a() {
        b();
        this.b();
    }
    void b() {
        System.out.println("I love you!");
    }
}
