import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        boolean i = false;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Guess: ");

        while (i == false) {
            count += 1;
            
            int guess = sc.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too Low. Guess Again.");
            }
            if (guess > randomNumber){
                System.out.println("Too High. Guess Again.");
            }
            if (guess == randomNumber) {
                System.out.println("You guessed it in " + count + " guesses.  The number was " + randomNumber );
                i = true;
            }
            
        }

    }
}
