class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Exercise6 extends BoardGame {
    Exercise6() {
        super(1);
        System.out.println("Exercise6 constructor");
    }
    public static void main(String[] args) {
        Exercise6 x = new Exercise6();
    }
}
