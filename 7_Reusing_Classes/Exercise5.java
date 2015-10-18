class A {}
class B {}

class C extends A {
    B b = new B();
}

class Exercise5 {
    public static void main(String[] args) {
        new C();
    }
}
