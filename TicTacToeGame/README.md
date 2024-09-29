## Tic Tac Toe Game

main () -> initializeGame() -> startGame()

void inititalizeGame() {
    define player 1 with piece x
    define player2 with piece o

    add both the players in the deque
}

 string startGame () {
    iswinner = true;

    while(iswinner){

        playerturn = removeFirst() from deque;

        scanner input = x,y;

        split string row = x;
        split string col = y;

        if(x,y) has spaceAvailable;
        if(!spaceAvailable){
            sout( "please enter the correct position);
            deque.addFirst(playerTurn); // he will tryagain
            continue;
        }

        deque.addLast(playerTurn);

        isPlayerTurnWins(x, y)

    }
}

 boolean isPlayerTurnWins(x, y, board){
    

    //row check

    for(int i=0;i<board.size();i++){
        if(board[row][i] == null || board[row][i].playingPiece.name() != playerTurn.PieceType.name())
    }
 }

