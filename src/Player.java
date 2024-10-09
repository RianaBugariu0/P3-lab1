import java.util.Random;

public class Player {
    private String name;
    private int wins;
    private Random random;


    public Player(String name) {
        this.name = name;
        this.wins = 0;
        this.random = new Random();
    }


    public int getWins() {
        return wins;
    }

    public void incrementWins() {
        wins++;
    }


    public int chooseNumber() {
        return random.nextInt(100) + 1;
    }

    public String getName() {
        return name;
    }
}













