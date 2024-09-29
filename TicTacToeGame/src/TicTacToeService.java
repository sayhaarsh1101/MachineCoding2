import java.util.Deque;
import java.util.Scanner;

import model.Board;
import model.PieceType;
import model.Player;
import model.PlayingPeice;
import model.PlayingPieceO;
import model.PlayingPieceX;

import java.util.LinkedList;



public class TicTacToeService {

    Deque<Player> players;
    Board gameboard;

   public void initializeGame(){

        players = new LinkedList<>();

        PlayingPieceX crPlayingPeice = new PlayingPieceX();
        Player player1 = new Player("1", crPlayingPeice);

        PlayingPieceO nPlayingPeice= new PlayingPieceO();
        Player player2 = new Player("2", nPlayingPeice);


        players.add(player1);
        players.add(player2);

        gameboard = new Board(3);
        
    }

    public String playGame(){

        boolean isWinner = true;
        while(isWinner){

            if(!gameboard.isFreeCell()){
                isWinner = false;
                continue;
            }

            
            Player playerTurn = players.removeFirst();
            gameboard.printBoard();

            System.out.print("Player name" + playerTurn.name + "Enter x, y position : ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
    
            String[] splStrings = s.split(",");
            int x = Integer.parseInt(splStrings[0]);
            int y = Integer.parseInt(splStrings[1]);

            boolean isSpaceAvailable = gameboard.addPiece(x, y, playerTurn.piece.pieceType);

            if(!isSpaceAvailable){
                System.out.println("Please enter correct position");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean isPlayerTurnWinner = isThatWinner(x, y, playerTurn.piece.pieceType);
            if(isPlayerTurnWinner){
                return playerTurn.name; 
            }

            
        }
        return "tie";
        
    }

    boolean isThatWinner(int row, int col, PieceType pieceTyp){

        boolean isRowwinner = true;
        boolean isColWinner = true;
        boolean isDiagWinner = true;
        boolean isRevDiagWinner = true;

        for(int i=0 ;i<gameboard.size;i++){
            if(gameboard.board[row][i] ==null || gameboard.board[row][i].pieceType != pieceTyp){
                isRowwinner = false;
            }
        }

        for(int i=0 ;i<gameboard.size;i++){
            if(gameboard.board[i][col] ==null || gameboard.board[i][col].pieceType != pieceTyp){
                isColWinner= false;
            }
        }

        for(int i=0, j=0 ;i<gameboard.size;i++, j++){
            if(gameboard.board[i][j] ==null || gameboard.board[i][j].pieceType != pieceTyp){
                isDiagWinner = false;
            }
        }
        for(int i=0 , j=gameboard.size-1;i<gameboard.size;i++, j--){
            if(gameboard.board[i][j] ==null || gameboard.board[i][j].pieceType != pieceTyp){
                isRevDiagWinner = false;
            }
        }
        return isRowwinner || isColWinner || isDiagWinner || isRevDiagWinner;
    }

}
