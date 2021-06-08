/*
    Loop until an Q is typed
 */
public class ForTest {
    public static void main(String[] args)
        throws java.io.IOException {

        int i;

        System.out.println("Press Q to stop.");

        for (i = 0; (char) System.in.read() != 'Q'; i++) {
            System.out.println("Pass #" + i );
        }
    }
}
