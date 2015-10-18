class Art {
    Art(){ System.out.println("Art constructor"); }
}

class Drawing extends Art {
   Drawing() { System.out.println("Drawing constructor"); }
}

public class Exercise3  extends Drawing {
    // public Exercise3() {System.out.println("Cartoon constructor!");}
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
