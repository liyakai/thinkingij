import java.util.*;

public class exercise4 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float  speed, distance, time;
        distance = rand.nextInt(100) + 1;
        System.out.println("distance is : " + distance);
        time = rand.nextInt(100) + 1;
        System.out.println("time is : " + time);
        speed = distance / time;
        System.out.println("speed is : " + speed);
    }
}
