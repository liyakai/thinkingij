class A {
    A(int i){
        System.out.println("A(int i) constructor");
    }
}
class B {
    B(int i){
        System.out.println("B(int i) constructor");
    }
}

class C extends A {
    C() {
        super(11);
    }
    B b = new B(13);
}

class Exercise7 {
    public static void main(String[] args) {
        new C();
    }
}
