interface a {}

interface b1 extends a{}

interface b2 extends a{}

interface c extends b1, b2{}

public class Exercise13 implements c {
    public static void main(String[] args) {
        
    }
}
