package SuperclassRefAndSubclassObj;

public class Y extends X{
//    int a;
//
//    Y(int i) { a = i; }
    int b;

    Y(int i, int j) {
        super(j);
        b = i;
    }
}
