/*
    Demonstrate the do-while-loop.
 */
public class DoWhileDemo {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;

        do {
            System.out.print("Press a key following by ENTER: ");
            ch = (char) System.in.read(); // get a char
        } while(ch != 'q');
    }
}
