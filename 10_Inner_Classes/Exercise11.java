interface Bark {
    public void print();
}

public class Exercise11 {
    private Bark internalTracking() {   
        return new TrackingSlip();
    }
    private class TrackingSlip implements Bark {
        public void print() {
            System.out.println("This is TrackingSlip.");
        }
    }
    public static void main(String[] args) {
        Exercise11 ex = new Exercise11();
        TrackingSlip track = ex.internalTracking();
    }
}
