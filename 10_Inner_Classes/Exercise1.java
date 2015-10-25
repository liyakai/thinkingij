
class Exercise1 {
    class Inner{}
    public Inner to(){
        return new Inner();
    }
    public static void main(String[] args) {
        Exercise1  outer = new Exercise1();
        Exercise1.Inner inner = outer.to();
    }
}
