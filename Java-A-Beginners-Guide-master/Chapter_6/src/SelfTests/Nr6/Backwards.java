package SelfTests.Nr6;
// Display a string backwards using recursion.
public class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if(idx != str.length()-1) backward(idx+1);

        System.out.print(str.charAt(idx));
    }
}
