package TypeInterfaceWithDiamondOperator;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    // Pass the constructor a reference to an object of type T
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    // ...
}
