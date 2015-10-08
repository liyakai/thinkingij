public class Exercise6 {
    public static void main(String[] args){
        new Dog(1,"hello");
        new Dog("hello", 1);
    }
}

class Dog {
    Dog(int i, String s){
        System.out.println("barking");
    }
    Dog(String s, int i) {
        System.out.println("howling");
    }
}
