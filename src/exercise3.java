import java.util.Scanner;
import java.util.Random;

class Game{
    int comp;
    int userInput;

    private int noOfGuesses;

    //Method1
    public int takeUserInput(){

        Scanner s= new Scanner(System.in);
        System.out.println("Input Guessed No.-");
        userInput=s.nextInt();
        return userInput;
    }
    //Method2
    public void correctNo(){

        if(comp==userInput){
            noOfGuesses+=1;
            System.out.println("Success and your score was "+ noOfGuesses);
        }
        else{
            if (comp>userInput){
                System.out.println("Try again with a larger number");
                noOfGuesses+=1;
                userInput=takeUserInput();
                correctNo();

            }
            else {
                System.out.println("try again with a smaller number");
                noOfGuesses+=1;
                userInput=takeUserInput();
                correctNo();
            }
        }

    }
}

public class exercise3 {
    public static void main(String[] args) {
         /*
         Guessing game: With conditions:-
         1. Constructor for random number
         2. takeUserInput() for taking user input
         3. isCorrectNumber() to detect whether the number entered by the user is true
         4. Use getter and setter for no of guesses
         Use properties such as noOfGuesses(int)
          */
        Random random=new Random();
        System.out.println("Input the number which computer guessed!!\n(Hint it's between 0 to 100)");
        Game newGame= new Game();
        newGame.comp= random.nextInt(100);
        newGame.takeUserInput();
        newGame.correctNo();
    }
}