import java.util.Scanner;
class NumberGuessingGame
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
    int numOfAttempts = 10;

    int targetNumber = (int)(10*Math.random()) + (1000* (int)(Math.random()));

    for (int i =1; i<=numOfAttempts; i++)
    {
        System.out.println("\nGuess the number: ");

        int guessedNumber = input.nextInt();

        
        if (guessedNumber < targetNumber)
        {
            System.out.println("\nThe number you guessed is lower than the correct number.");
            if (i<numOfAttempts)
            {
                System.out.println("\nYou have " + (numOfAttempts-i) + " attempts left");
                System.out.println("\n-------------------------------------------------------------------");
            }

            else
            {
                System.out.println("GAME OVER!");
                System.out.println("You ran out of attempts");
                System.out.println("The correct number was "+targetNumber);

            }                         
            
        }

        else if (guessedNumber > targetNumber)
        {
            System.out.println("The number you guessed is higher than the correct number.");
            if (i<numOfAttempts)
            {
                System.out.println("You have " + (numOfAttempts-i) + " attempts left" );
                System.out.println("---------------------------------------------------------------------");
            }

            else
            {
                System.out.println("GAME OVER!");
                System.out.println("You ran out of attempts");
                System.out.println("The correct number was "+targetNumber);
            }                         
            
        }

        else{

            System.out.println("CONGRATULATIONS!!!!!");
            System.out.println("You guessed the Correct Number");
            break;
        }
    }

}
}
