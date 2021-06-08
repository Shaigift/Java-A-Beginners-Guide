package Static;

public class SDemo3 {
    public static void main(String args[]) {
        StaticBlock ob = new StaticBlock("Inside Constructor");

        System.out.println("Square root of 4 is " +
                StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " +
                StaticBlock.rootOf3);

    }
}