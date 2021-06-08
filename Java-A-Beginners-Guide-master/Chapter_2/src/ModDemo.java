/*
    Demonstrate the % operator.
 */
public class ModDemo {
    public static void main(String[] args) {
        int iResult, iRem;
        double dResult, dRem;

        iResult = 10 / 3;
        iRem = 10 % 3;
        System.out.println("Result and remainder of 10 / 3: " + iResult + " " + iRem);

        dResult = 10.0 / 3.0;
        dRem = 10.0 % 3.0;
        System.out.println("Result and remainder of 10.0 / 3.0: " + dResult + " " + dRem);
    }
}
