public class Exercise10 {
    public static void main(String[] args) {
      Dog test =  new Dog();
      test = new Dog();
      test = null;
    }
}

class Dog {
    public void finalize() throws Throwable{
        System.out.println("This is finalize()");
        super.finalize();
    }
}
