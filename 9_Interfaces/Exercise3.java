abstract class Animal {
    Animal(){
        print();
    }
    abstract void print();
}

class Dog extends Animal {
    int i = 1;
    void print(){
        System.out.println("Dog i = " + i );
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();
    }
}
