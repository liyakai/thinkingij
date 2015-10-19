class Component1 {
    Component1() {
        System.out.println("Component1() constructor");
    }
}

class Component2 {
    Component2() {
         System.out.println("Component2() constructor");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3() constructor");
    }
}

class Root {
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();
    Root() {
        System.out.println("Root() constructor");
    }
}

class Stem extends Root {
    Component1 comp1 = new Component1();
    Component2 comp2 = new Component2();
    Component3 comp3 = new Component3();
    Stem() {
        System.out.println("Stem constructor");
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        new Stem();
    }
}
