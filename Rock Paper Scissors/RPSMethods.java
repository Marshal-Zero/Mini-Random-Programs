package rpsmethods;

import java.util.Random;
import java.util.Scanner;

public class RPSMethods {


    /*This is the main method and it contains 4 lines of code only.
     1- invokes displayOpeningMessage method which will print a message only.
     2- invokes userMove method and assigns int userMove to the inputted returned value
     3- invokes botMove method and assigns int botMove to the random returned value.
     4- prints the output from the method winningLogic  
     */
    public static void main(String[] args) {

        displayOpeningMessage();

        int userMove = userMove();

        int botMove = botMove();

        System.out.println(winningLogic(userMove, botMove));

    } //end of main method

    //This method will display the following message to the player at the start of the program to give instructions.
    public static void displayOpeningMessage() {

        System.out.println("Welcome to RPS v1.2 \n "
                + "\nTest your luck against our bot in a game of rock-paper-scissor");
        System.out.println("\nScissor = 0 \nRock    = 1 \nPaper   = 2");
    } //end of displayOpeningMessage

    /*
     This method will take an input from the user and return it.
     If the user chooses a number outside the range then the following message will appear
     as long as they keep entering invalid inputs.
     */
    public static int userMove() {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a number between 0 and 2!");
            while (!input.hasNextInt()) {
                System.out.println("That's not a number!");
                input.next();
            }
            number = input.nextInt();
        } while (number < 0 || number > 2);
        return number;

    } //end of userMove

    // This method will generate a random number between 0 and 2 and then return it for the bot's play.  
    public static int botMove() {
        int BOT;
        Random RNG = new Random();
        BOT = RNG.nextInt(3);
        return BOT;
    } //end of botMove

    /**
     *
     * @param userMove
     * @param botMove
     * @return
     */
    // This method will determine the winner in chunks of if else statments.
    public static String winningLogic(int userMove, int botMove) {

        //First we check if it's a draw.
        if (userMove == botMove) {
            if (userMove == 0) {
                return "Draw! Both of you chose scissor.";
            } else if (userMove == 1) {
                return "Draw! Both of you chose rock.";
            } else {
                return "Draw! Both of you chose paper";
            }

        }

//Winning logic
//Player choosing scissor.
        if (userMove == 0) {
            if (botMove == 1) {
                return "You chose scissor. Bot chose rock. \n Bot wins!";
            } else if (botMove == 2) {
                return "You chose scissor. Bot chose paper . \n You win!";
            }

        } //Player choosing rock
        else if (userMove == 1) {
            if (botMove == 0) {
                return "You chose rock. Bot chose scissor. \n You win!";
            } else if (botMove == 2) {
                return "You chose rock. Bot chose paper. \n Bot wins!";
            }
        } //Player choosing paper.
        else if (userMove == 2) {
            if (botMove == 0) {
                return "You chose paper. Bot chose scissor. \n Bot wins!";
            } else if (botMove == 1) {
                return "You chose paper. Bot chose rock. \n You win!";
            }
        }
        return null;

    } //end of winningLogic

} //class

