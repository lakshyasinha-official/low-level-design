package LLD.TicTacTeo.Model;

import java.util.List;

public class Board {
    int size;
    char[][] board ;
    List<PlayingPeice> playingPeiceList ;
    int freeSpaces;
    public Board (int size ){
        this.size = size;
        this.board = new char[size][size];
        this.freeSpaces = (this.size*this.size);

    }
    public char[][] getBoard() {
        return board;
    }

    public int getFreeSpaces() {
        return freeSpaces;
    }
    public boolean isFreeAvailable(){
        return freeSpaces !=0;
    }
    public  boolean addElement(PeiceType peiceType, int row ,int col){


            char item =  board[row][col];
            if(item =='\0'){
                board[row][col] = peiceType ==PeiceType.O?'O':'X';
                freeSpaces--;
                return true;
            }
            else return  false;
    }

}
