import java.util.*;

class Gerbil {
    static int mount = 1;
    int gerbilNumber = mount++;
    void hop(){
        System.out.println("No." + gerbilNumber + " is hopping.");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbil = new ArrayList<Gerbil>();
        gerbil.add(new Gerbil());
        gerbil.add(new Gerbil());
        gerbil.add(new Gerbil());
        for (Gerbil g : gerbil)
            g.hop();
    }
}
