package BoundedTypes;

// In this version of NumericFns, the type argument
// for T must be either Number, or a class derived
// from Number.
class NumericFns<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // ...
}


// NumericFns attemps (unsuccessfully) to create
// a generic class that can compute various
// numeric functions, such as the reciprocal or the
// fractional component, given any type of number.
//public class NumericFns<T> {
//    T num;
//
//    // Pass the constructor a reference to
//    // a numeric object.
//    NumericFns(T n) {
//        num = n;
//    }
//
//    // Return the reciprocal.
//    double reciprocal() {
//        return 1 / num.doubleValue(); // Error!
//    }
//
//    // Return the fractional component.
//    double fraction() {
//        return num.doubleValue() - num.intValue(); // Error!
//    }
//
//    // ...
//}