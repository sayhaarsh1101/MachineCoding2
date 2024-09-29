package model;

public class Player {

    public String name;
    public PlayingPeice piece;

    public Player(String name, PlayingPeice pieceType){
        this.name = name;
        this.piece= pieceType;
    }
}
