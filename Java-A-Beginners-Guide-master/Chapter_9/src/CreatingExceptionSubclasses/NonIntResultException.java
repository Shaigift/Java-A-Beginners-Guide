package CreatingExceptionSubclasses;
// Use a custom exception.

// Create an exception.
public class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d +
                " is non-integer.";
    }
}
