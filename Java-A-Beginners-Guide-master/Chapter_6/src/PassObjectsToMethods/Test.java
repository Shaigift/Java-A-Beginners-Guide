package PassObjectsToMethods;
// Primitive types are passed by value.
public class Test {
    /* This method causes no changes to the arguments
        used in the call.
     */
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
