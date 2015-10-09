public class Exercise14 {
    public static void main(String[] args) {
        System.out.println("come into main.");
        Dog dog = new Dog();
        dog.print();
    }
}
class Dog { 
    static String s1 = "hello";
    static String s2;
    static {
        s2 = "nihao";
    }
    static void print() {
        System.out.println("s1: " + s1 + "  s2: " + s2);
    }
}
