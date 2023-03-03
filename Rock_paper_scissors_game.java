public class Rock_paper_scissors_game {
    public static void main(String[] args) {
        int player1 = (int) (Math.random() * 3);
        int player2 = (int) (Math.random() * 3);

        System.out.println("Player 1 choose: " + player1);
        System.out.println("Player 2 choose: " + player2);
        if (player1 == 0 && player2 == 2 || player1 == 1 && player2 == 0 || player1 == 2 && player2 == 1) {
            System.out.println("Player 1 win");
        } else if (player1 == 0 && player2 == 1 || player1 == 1 && player2 == 2 || player1 == 2 && player2 == 0) {
            System.out.println("Player 2 win");
        } else if (player1 == player2) {
            System.out.println("Draw");
        } else {
            System.out.println("Player 1 win");

        }

    }
}
