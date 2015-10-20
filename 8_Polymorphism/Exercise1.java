
class Cycle {
    public void play() {
        System.out.println("Cycle.play()");
    }
}

class Unicucle extends Cycle {
    public void play() {
        System.out.println("Unicucle.play()");
    }
}

class Bicycle extends Cycle { 
    public void play() {
        System.out.println("Bicycle.play()");
    }
}

class Tricycle extends Cycle { public void play() {
        System.out.println("Tricycle.play()");
    }
}

public class Exercise1 {
    public static void ride(Cycle c) {
        c.play();
    }
    
    public static void main(String[] args){
        Cycle u = new Unicucle();
        Cycle b = new Bicycle();
        Cycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
