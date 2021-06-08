package GenericRestrictions;
//// Can't create an instance of T.
//public class Gen<T> {
//    T ob;
//    Gen() {
//        ob = new T(); // Illegal!!!
//    }
//}

// Generics and arrays.
class Gen<T extends Number> {
    T ob;

    T vals[]; // OK

    Gen(T o, T[] nums) {
        ob = o;

        // This statement is illegal.
//  vals = new T[10]; // can't create an array of T

        // But, this statement is OK.
        vals = nums; // OK to assign reference to existent array
    }
}
