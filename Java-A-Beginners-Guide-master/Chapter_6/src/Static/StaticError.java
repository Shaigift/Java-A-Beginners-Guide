package Static;

public class StaticError {
    static int denom = 3; // a normal instance variable , will work if static
    // int denom = 3; // a normal instance variable
    static int val = 1024; // a static variable

    /* Error! Can't access a non-static variable
       from within a static method. */
    static int valDivDenom() {
        return val/denom; // won't compile!
    }
}
