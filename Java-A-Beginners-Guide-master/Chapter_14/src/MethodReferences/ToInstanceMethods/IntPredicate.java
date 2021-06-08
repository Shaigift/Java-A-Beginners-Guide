package MethodReferences.ToInstanceMethods;
// Use a method reference to an instance method.

// A functional interface for numeric predicates that operate
// on integer values.
public interface IntPredicate {
    boolean test(int n);
}