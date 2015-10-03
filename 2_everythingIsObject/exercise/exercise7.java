
public class exercise7 {
    public static void main(String[] args){
   Incrementable sf = new Incrementable();
    System.out.printf("StaticTest.i = %d\n", StaticTest.i);
    System.out.println("use the function in normal way to increase 1:\n");
    sf.increment();
    System.out.println("use the static way wo increase 1: \n");
    Incrementable.increment();
    System.out.printf("Now, i = %d;", StaticTest.i);
    }
}

class StaticTest {
    static int i = 0;
}

class Incrementable {
    static void increment() { StaticTest.i++;}
}
