package PassObjectsToMethods;

public class PassObjRef {
    public static void main(String args[]) {
        Test1 ob = new Test1(15, 20);

        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }
}
