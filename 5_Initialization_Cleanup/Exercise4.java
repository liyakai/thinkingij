public class Exercise4 {
    public static void main(String[] args){
        new AClass("I love you!");
    }
}

class AClass {
    AClass(){
        System.out.println("This is AClass's constructor");
    }
    AClass(String s){
        System.out.println("The next is String s's content: " + s);
    }
}
