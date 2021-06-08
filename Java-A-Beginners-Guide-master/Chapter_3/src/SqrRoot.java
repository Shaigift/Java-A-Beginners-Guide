/*
    Show square roots of 1 to 99 and the rounding error
 */
public class SqrRoot {
    public static void main(String args[]) {
        double num, sRoot, rErr;

        for(num = 1.0; num < 100.0; num++) {
            sRoot = Math.sqrt(num);
            System.out.println("Square root of " + num +
                    " is " + sRoot);

            // compute rounding error 
            rErr = num - (sRoot * sRoot);
            System.out.println("Rounding error is " + rErr);
            System.out.println();
        }
    }
}
