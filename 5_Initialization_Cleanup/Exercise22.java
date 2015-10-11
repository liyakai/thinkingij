enum Banknotes {
    one, two, three, four, five, six;
}

class Money {
    Banknotes banknotes;
    public Money(Banknotes banknotes) { this.banknotes = banknotes;}
    public void describe() {
        System.out.print("This money is ");
        switch(banknotes) {
            case one:
                System.out.println("This is one.");
                break;
            case two:
                System.out.println("This is two.");
                break;
            case three:
                System.out.println("This is three.");
                break;
            case four:
                System.out.println("This is four.");
                break;
            case five:
                System.out.println("This is five.");
                break;
            case six:
                System.out.println("This is six.");
                break;
            default:
                System.out.println("This is default.");
                break;
            
        }
    }
}

public class Exercise22 {
    public static void main(String[] args) {
        Money
            money1 = new Money(Banknotes.one),
            money2 = new Money(Banknotes.two),
            money3 = new Money(Banknotes.three);
        money1.describe();
        money2.describe();
        money3.describe();
    }
}
