public class Exercise9 {
    public static void main(String[] args){
        new Dog("guaiguai", 2);
    }
}

class Dog{
    Dog(String name, int i){
        this(i);
        System.out.println("Dog's name is: " + name);
    }
    Dog(int i){
        System.out.println(i + "years old.");
   } 
}
