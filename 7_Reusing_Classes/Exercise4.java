class Art {
    Art(){ System.out.println("Art constructor"); }
}

class Drawing extends Art {
   Drawing() { System.out.println("Drawing constructor"); }
}

public class Exercise4  extends Drawing {
    public Exercise4() {System.out.println("Cartoon constructor");}
    public static void main(String[] args) {
        Exercise4 x = new Exercise4();
    }
}
