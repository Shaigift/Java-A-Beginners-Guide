package Static;
// Use a static block
public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(4.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}


