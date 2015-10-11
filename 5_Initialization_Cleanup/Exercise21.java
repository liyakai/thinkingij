enum Banknotes {
    one, two, three, four, five, six;
}

public class Exercise21 {
    public static void main(String[] args) {
        for (Banknotes s : Banknotes.values())
            System.out.println(s + ", ordin " + s.ordinal());
    }
}
