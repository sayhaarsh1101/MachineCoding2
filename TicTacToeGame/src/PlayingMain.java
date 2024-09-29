public class PlayingMain {
    public static void main(String[] args) throws Exception {

        System.out.println("sfvbdfbdbtbnwrtn");

        TicTacToeService ticTacToeService = new TicTacToeService();
        ticTacToeService.initializeGame();

        System.out.println("Winner is " + ticTacToeService.playGame());
        
    }
}
