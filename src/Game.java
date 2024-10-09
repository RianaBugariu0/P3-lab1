public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new Player("Porumbel Ria");
        player2 = new Player("Bibi porumbel");
    }



    private boolean isGameOver() {
        return player1.getWins() >= 5 || player2.getWins() >= 5;
    }




    public void playGame() {
        System.out.println("Starting the game...");

        while (!isGameOver()) {
            playRound();
        }

        if (player1.getWins() >= 5) {
            System.out.println(player1.getName() + " wins the game!");
        } else {
            System.out.println(player2.getName() + " wins the game!");
        }
    }
    private void playRound() {
        int num1 = player1.chooseNumber();
        int num2 = player2.chooseNumber();


        System.out.println(player1.getName() + " chose: " + num1);
        System.out.println(player2.getName() + " chose: " + num2);


        if (num1 == num2) {
            System.out.println("It's a tie! Both players get 2 points.");
            player1.incrementWins();
            player2.incrementWins();
        } else if (isSpecialRule(num1, num2)) {
            System.out.println(player2.getName() + " wins the round due to the special rule!");
            player2.incrementWins();
        } else if (isSpecialRule(num2, num1)) {
            System.out.println(player1.getName() + " wins the round due to the special rule!");
            player1.incrementWins();
        } else if (num1 > num2) {
            System.out.println(player1.getName() + " wins the round!");
            player1.incrementWins();
        } else {
            System.out.println(player2.getName() + " wins the round!");
            player2.incrementWins();
        }

        System.out.println(player1.getName() + " wins: " + player1.getWins());
        System.out.println(player2.getName() + " wins: " + player2.getWins());

    }


    private boolean isSpecialRule(int high, int low) {
        return high % low == 0 && low >= 10;
    }

}














