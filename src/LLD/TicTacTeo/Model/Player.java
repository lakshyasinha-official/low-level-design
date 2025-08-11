package LLD.TicTacTeo.Model;

public class Player {
    String name ;
    PeiceType peiceType ;
    int turnSequence ;

    public Player(String name, PeiceType peiceType, int turnSequence){
        this.name  = name;
        this.peiceType = peiceType;
        this.turnSequence = turnSequence;
    }

    public PeiceType getPeiceType() {
        return peiceType;
    }
}
