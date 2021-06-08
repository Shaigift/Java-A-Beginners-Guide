package PassObjectsToMethods;

// Objects are passed through their references.
public class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }
    /* Pass an object. Now, ob.a and ob.b in object
       used in the call will be changed. */
    void change(Test1 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
