package Strings;
// Use substring().
public class SubStr {
    public static void main(String args[]) {
        String orgstr = "Java makes the Web move.";

        // construct a substring
        String substr = orgstr.substring(5, 18);


        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

    }
}
