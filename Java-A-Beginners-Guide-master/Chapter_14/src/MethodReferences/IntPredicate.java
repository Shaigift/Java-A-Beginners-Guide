package MethodReferences;
// Demonstrate a method reference for a static method.

// A functional interface for numeric predicates that operate
// on integer values.
public interface IntPredicate {
    boolean test(int n);
}