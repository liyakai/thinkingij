class A {
    int i;
    A(int i){
        System.out.println("A(int i) constructor");
    }
}

class B extends A {
    B() {
        super(11);
        System.out.println("B() constructor");
    }

    B(int i) {
        super(i);
        System.out.println("B(int i) constructor");
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        new B(13);
    }
}
