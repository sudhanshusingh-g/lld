package Project.GuessGame;

public class Player {
    String name;
    private int guess;
    Player(String name){
        this.name=name;
    }
    int getGuess(){
        return guess;
    }

    void makeGuess(){
        this.guess=(int)(Math.random()*9)+1;
        System.out.println(this.name +" guessed "+ this.guess);
    }
}
