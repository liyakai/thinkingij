interface Bark {
    public void print();
}

public class Exercise10 {
    private Bark internalTracking() {   
        return new TrackingSlip();
    }
    class TrackingSlip implements Bark {
        public void print() {
            System.out.println("This is TrackingSlip.");
        }
    }
    public static void main(String[] args) {

    }
}
