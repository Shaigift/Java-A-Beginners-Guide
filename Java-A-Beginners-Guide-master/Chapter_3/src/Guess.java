/*
    Guess the letter game
 */
public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can u guess it: ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("**Right**");
        } else {
            System.out.println("...Sorry, you're wrong.");
            // a nested if
            if (ch < answer) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }
    }
}
