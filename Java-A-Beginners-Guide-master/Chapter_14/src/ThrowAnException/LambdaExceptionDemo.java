package ThrowAnException;

public class LambdaExceptionDemo {
    public static void main(String args[])
    {

        // This block lambda could throw an IOException.
        // Thus, IOException must be specified in a throws
        // clause of ioAction() in MyIOAction.
        MyIOAction myIO = (rdr) ->  {
            int ch = rdr.read(); // could throw IOException
            // ...
            return true;
        };
    }
}
