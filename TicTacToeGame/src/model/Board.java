package model;


public class Board {

    public int size;
    public PlayingPeice[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPeice[size][size];
    }

    public boolean addPiece(int x, int y, PieceType pieceType){
        if(board[x][y] != null) {
            return false;
        }
        board[x][y] = new PlayingPeice(pieceType);
        return true;
    }

    public boolean isFreeCell(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == null){
                    return true;
                }
            }
        }
        return false;
        
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] != null){
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
        
    }

}
