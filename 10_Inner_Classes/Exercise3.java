
class Exercise3 {
    String string;
    Exercise3() {
        string = "Exercise3";
    }
    class  Inner{
        public String toString() {
            return "Exercise3$Inner";
        }
    }
    public Inner to(){
        return new Inner();
    }
    public static void main(String[] args) {
        Exercise3  outer = new Exercise3();
        Exercise3.Inner inner = outer.to();
        System.out.println(inner);
    }
}
