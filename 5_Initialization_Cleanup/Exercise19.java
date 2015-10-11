public class Exercise19 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.f("ni", "hao", "hello", "world");
    }
}

class Dog {
    static void f(String... args) {
        System.out.println("f.s: ");
        for (String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
}
