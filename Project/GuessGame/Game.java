package Project.GuessGame;

public class Game {
    int computerGuess;
    Player p1,p2,p3;

    public Game(String n1,String n2,String n3) {
        p1=new Player(n1);
        p2=new Player(n2);
        p3=new Player(n3);
    }
    private boolean checkWinner(){
        if(p1.getGuess()==computerGuess){
            System.out.println(p1.name +" wins.");
            return true;
        }
        else if(p2.getGuess()==computerGuess){
            System.out.println(p2.name +" wins.");
            return true;
        }
        else if(p3.getGuess()==computerGuess){
            System.out.println(p3.name +" wins.");
            return true;
        }
        return false;
    }

    void launch(){
//        Update the computer guess
        System.out.println("Welcome to game!");
        this.computerGuess=(int)(Math.random()*9)+1;

        while (true){
            System.out.println("Computer guessed :"+this.computerGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            if(checkWinner()){
                System.out.println("Game over");
                break;
            }
            else {
                this.computerGuess=(int)(Math.random()*9)+1;
            }
        }

    }
}
