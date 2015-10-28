interface Bark {
    public void print();
}

public class Exercise9 {
    private Bark internalTracking() {
        class TrackingSlip implements Bark {
            public void print() {
                System.out.println("This is TrackingSlip.");
            }
        }
        return new TrackingSlip();
    }
    public static void main(String[] args) {

    }
}
