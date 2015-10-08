public class Exercise5 {
    public static void main(String[] args){
        new Dog(1);
        new Dog("hello");
    }
}

class Dog {
    Dog(int i){
        System.out.println("barking");
    }
    Dog(String s) {
        System.out.println("howling");
    }
}
