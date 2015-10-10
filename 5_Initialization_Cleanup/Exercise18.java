class Dog {
    String s;
    Dog(String s) {
        this.s = s;
        System.out.println("s: " + s);
    }
}

public class Exercise18 {
    public static void main(String[] args) {
        Dog[] str = new Dog[5];
        str[0] = new Dog("str[0]");
    }
}
